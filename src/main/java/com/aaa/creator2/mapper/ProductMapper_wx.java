package com.aaa.creator2.mapper;

import com.aaa.creator2.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper_wx {
    public List<Product> selPro();
    public List<Product> selProduct(Integer sid);
}
