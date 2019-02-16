package com.zysm.ltshop.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.zysm.ltshop.domain.Brand;
import com.zysm.ltshop.mapper.BrandMapper;
import com.zysm.ltshop.query.BrandQuery;
import com.zysm.ltshop.service.IBrandService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zysm.ltshop.util.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author Mr_shi
 * @since 2019-02-15
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

    @Autowired
    BrandMapper brandMapper;
    @Override
    public PageList<Brand> selectBrandPage(BrandQuery query) {
        Page<Brand> page = new Page<Brand>(query.getPage(),query.getRows());
        page.setRecords(brandMapper.selectBrandPage(page, query));
        return new PageList<Brand>(page.getTotal(),page.getRecords());
    }
}
