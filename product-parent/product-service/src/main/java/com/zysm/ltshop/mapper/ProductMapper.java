package com.zysm.ltshop.mapper;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.zysm.ltshop.domain.Product;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 商品 Mapper 接口
 * </p>
 *
 * @author Mr_shi
 * @since 2019-02-20
 */
public interface ProductMapper extends BaseMapper<Product> {

    List<Product> selectProductPage(Page page,@Param("ew")EntityWrapper wrapper);
}
