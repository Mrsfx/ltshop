package com.zysm.ltshop.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.zysm.ltshop.domain.Brand;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zysm.ltshop.query.BrandQuery;

import java.util.List;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author Mr_shi
 * @since 2019-02-15
 */
public interface BrandMapper extends BaseMapper<Brand> {

    List<Brand> selectBrandPage(Page<Brand> page, BrandQuery query);
}
