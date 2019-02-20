package com.zysm.ltshop.service;

import com.zysm.ltshop.domain.ProductType;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author Mr_shi
 * @since 2019-02-15
 */
public interface IProductTypeService extends IService<ProductType> {

    List<ProductType> getProductTypeTree();

    void createStaticPage();
}
