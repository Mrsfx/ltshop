package com.zysm.ltshop.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zysm.ltshop.domain.Product;
import com.zysm.ltshop.domain.ProductExt;
import com.zysm.ltshop.mapper.ProductExtMapper;
import com.zysm.ltshop.mapper.ProductMapper;
import com.zysm.ltshop.query.ProductQuery;
import com.zysm.ltshop.service.IProductService;
import com.zysm.ltshop.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author Mr_shi
 * @since 2019-02-20
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductExtMapper productExtMapper;
    @Override
    public PageList<Product> selectProductPage(ProductQuery query) {
        Page<Product> page = new Page<>(query.getPage(), query.getRows());
        EntityWrapper wrapper = new EntityWrapper();
        wrapper.like("p.name", query.getKeyword())
                .or().like("p.subName",query.getKeyword() );
        List<Product> products = productMapper.selectProductPage(page, wrapper);
        return new PageList<Product>(page.getTotal(),products);
    }

    @Override
    public void updateViewProperties(Long id, String viewProperties) {
        //查出来
        Product product = productMapper.selectById(id);
        //改属性
        product.setViewProperties(viewProperties);
        //放进去
        productMapper.updateById(product);
    }

    @Override
    public boolean insert(Product entity) {
        boolean insert = super.insert(entity);
        Long id = entity.getId();
        ProductExt productExt = entity.getProductExt();
        productExt.setProductId(id);
        productExtMapper.insert(productExt);
        return insert;
    }

    @Override
    public boolean updateById(Product entity) {
        boolean update = super.updateById(entity);
        Long id = entity.getId();
        ProductExt productExt = entity.getProductExt();
        productExt.setProductId(id);
        productExtMapper.insert(productExt);
        return update;
    }
}
