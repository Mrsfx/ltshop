package com.zysm.ltshop.service;

import com.zysm.ltshop.domain.Product;
import com.baomidou.mybatisplus.service.IService;
import com.zysm.ltshop.query.ProductQuery;
import com.zysm.ltshop.util.PageList;

/**
 * <p>
 * 商品 服务类
 * </p>
 *
 * @author Mr_shi
 * @since 2019-02-20
 */
public interface IProductService extends IService<Product> {

    PageList<Product> selectProductPage(ProductQuery query);

    void updateViewProperties(Long id, String viewProperties);
}
