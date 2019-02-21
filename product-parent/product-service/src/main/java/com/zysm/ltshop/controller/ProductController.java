package com.zysm.ltshop.controller;

import com.alibaba.fastjson.JSONArray;
import com.zysm.ltshop.domain.Specification;
import com.zysm.ltshop.service.IProductService;
import com.zysm.ltshop.domain.Product;
import com.zysm.ltshop.query.ProductQuery;
import com.zysm.ltshop.util.AjaxResult;
import com.zysm.ltshop.util.PageList;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    public IProductService productService;

    /**
     * 保存和修改公用的
     *
     * @param product 传递的实体
     * @return Ajaxresult转换结果
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public AjaxResult save(@RequestBody Product product) {
        try {
            if (product.getId() != null) {
                productService.updateById(product);
            } else {
                productService.insert(product);
            }
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("保存对象失败！" + e.getMessage());
        }
    }

    /**
     * 删除对象信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            productService.deleteById(id);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！" + e.getMessage());
        }
    }

    //获取用户
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productService.selectById(id);
    }


    /**
     * 查看所有信息
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Product> list() {

        return productService.selectList(null);
    }


    /**
     * 分页查询数据
     *
     * @param query 查询对象
     * @return PageList 分页对象
     */
    @RequestMapping(value = "/json", method = RequestMethod.POST)
    public PageList<Product> json(@RequestBody ProductQuery query) {
        return productService.selectProductPage(query);
//        Page<Product> page = new Page<Product>(query.getPage(), query.getRows());
//        page = productService.selectPage(page);
//        return new PageList<Product>(page.getTotal(), page.getRecords());
    }

    @RequestMapping(value = "/viewProperties",method = RequestMethod.POST)
    public AjaxResult updateViewProperties(@RequestBody Map<String,Object> map){
        try {
            //取值
            Long id = Long.parseLong(map.get("id").toString());
            List<Specification> specifications = (List<Specification>) map.get("specifications");
            //将specifications转成json字符串
            String viewProperties = JSONArray.toJSONString(specifications);
            productService.updateViewProperties(id,viewProperties);
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("保存显示属性失败！");
        }
    }
}
