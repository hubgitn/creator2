package com.aaa.creator2.controller;

import com.aaa.creator2.entity.Product;
import com.aaa.creator2.entity.ProductVO;
import com.aaa.creator2.service.FoodInfoService;
import com.aaa.creator2.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("zr")
public class FoodInfoController {
    @Resource
    private FoodInfoService foodInfoService;

    @RequestMapping("selectProduct")
    public String selectProduct(){
        return "zr/foodItemInfo";
    }
    @RequestMapping("findProductInfo")
    @ResponseBody
    public PageUtil<List> findProductInfo(@RequestParam("limit") int limit, @RequestParam("page") int page) {
        List<ProductVO> listProduct = foodInfoService.findProductInfo(limit, page);
        int count = foodInfoService.ProductCount();
        PageUtil<List> list = new PageUtil<List>("", listProduct, 0, count);
        if (list != null) {
            return list;
        }
        return null;
    }
}
