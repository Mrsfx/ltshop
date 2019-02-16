package com.zysm.ltshop.service.impl;

import com.zysm.ltshop.domain.ProductType;
import com.zysm.ltshop.mapper.ProductTypeMapper;
import com.zysm.ltshop.service.IProductTypeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
