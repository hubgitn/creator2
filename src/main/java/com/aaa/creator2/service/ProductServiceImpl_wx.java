package com.aaa.creator2.service;

import com.aaa.creator2.entity.Product;
import com.aaa.creator2.mapper.ProductMapper_wx;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl_wx implements ProductService_wx {
    @Resource
    private ProductMapper_wx productMapper_wx;
    @Override
    public List<Product> selPro() {
        return productMapper_wx.selPro();
    }

    @Override
    public List<Product> selProduct(Integer sid) {
        return productMapper_wx.selProduct(sid);
    }
}
