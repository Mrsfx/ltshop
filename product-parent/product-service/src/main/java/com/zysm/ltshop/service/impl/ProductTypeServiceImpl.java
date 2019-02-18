package com.zysm.ltshop.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.zysm.ltshop.client.RedisClient;
import com.zysm.ltshop.domain.ProductType;
import com.zysm.ltshop.mapper.ProductTypeMapper;
import com.zysm.ltshop.service.IProductTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author Mr_shi
 * @since 2019-02-15
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

    @Autowired
    ProductTypeMapper productTypeMapper;

    @Autowired
    RedisClient redisClient;
    @Override
    public List<ProductType> getProductTypeTree() {
        String productType = redisClient.getRedis("productType");
//        判断缓存中是否有数据，有直接取出返回
        if (StringUtils.isNotBlank(productType)){
            System.out.println("redis====");
            List<ProductType> productTypes = JSONArray.parseArray(productType, ProductType.class);
            return productTypes;
        }else {
//            缓存为空，则查询数据库，返回数据并储存在Redis中
            System.out.println("mysql============");
            List<ProductType> productTypes = loadDataLoop();
            redisClient.setRedis("productType",JSONArray.toJSONString(productTypes));
            return productTypes;
        }
    }

    private List<ProductType> loadDataLoop(){
//        创建list存放一级菜单
        List<ProductType> list = new ArrayList<>();
//        查询所有类型
        List<ProductType> productTypes = productTypeMapper.selectList(null);
//        创建map存放所有类型信息，方便子菜单查找父类菜单
        Map<Long, ProductType> map = new HashMap<>();
        for (ProductType productType : productTypes) {
            map.put(productType.getId(), productType);
        }
//        遍历类型
        for (ProductType productType : productTypes) {
//            获取一级类型,存入list
            if(productType.getPid()==0){
                list.add(productType);
            }else {
//                不是一级类型的放入父类型里
                map.get(productType.getPid()).getChildren().add(productType);
            }
        }
        return list;
    }
}
