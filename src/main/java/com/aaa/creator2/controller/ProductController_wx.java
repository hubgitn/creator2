package com.aaa.creator2.controller;

import com.aaa.creator2.entity.Product;
import com.aaa.creator2.service.ProductService_wx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController_wx {
    @Autowired
    private ProductService_wx productService_wx;
    @ResponseBody
    @RequestMapping("selPro")
    public Object selPro(){
        List<Product> pro = productService_wx.selPro();
        return pro;
    }
    @ResponseBody
    @RequestMapping("selProduct")
    public Object selProduct(Integer sid){
        List<Product> products = productService_wx.selProduct(sid);
        return products;
    }
}
