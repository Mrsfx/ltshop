package com.zysm.ltshop.service.impl;

import com.zysm.ltshop.domain.Product;
import com.zysm.ltshop.mapper.ProductMapper;
import com.zysm.ltshop.service.IProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author Mr_shi
 * @since 2019-02-15
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
