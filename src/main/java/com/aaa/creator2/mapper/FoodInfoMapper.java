package com.aaa.creator2.mapper;

import com.aaa.creator2.entity.Product;
import com.aaa.creator2.entity.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodInfoMapper {
    public List<ProductVO> findProductInfo();
    public int ProductCount();
}
