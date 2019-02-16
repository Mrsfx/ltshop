package com.zysm.ltshop.service;

import com.zysm.ltshop.domain.Brand;
import com.baomidou.mybatisplus.service.IService;
import com.zysm.ltshop.query.BrandQuery;
import com.zysm.ltshop.util.PageList;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author Mr_shi
 * @since 2019-02-15
 */
public interface IBrandService extends IService<Brand> {

    PageList<Brand> selectBrandPage(BrandQuery query);
}
