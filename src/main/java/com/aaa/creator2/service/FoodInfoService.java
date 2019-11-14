package com.aaa.creator2.service;

import com.aaa.creator2.entity.Product;
import com.aaa.creator2.entity.ProductVO;

import java.util.List;

public interface FoodInfoService {
    public List<ProductVO> findProductInfo(int limit, int page);
    public int ProductCount();
}
