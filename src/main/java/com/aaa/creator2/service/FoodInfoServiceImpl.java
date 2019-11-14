package com.aaa.creator2.service;

import com.aaa.creator2.entity.Product;
import com.aaa.creator2.entity.ProductVO;
import com.aaa.creator2.mapper.FoodInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class FoodInfoServiceImpl implements FoodInfoService {

    @Resource
    private FoodInfoMapper foodInfoMapper;

    @Override
    public List<ProductVO> findProductInfo(int limit, int page) {
        Product pro=new Product();
        pro.setStartRow((page-1)*limit);
        pro.setPageSize(limit);
        return foodInfoMapper.findProductInfo();
    }

    @Override
    public int ProductCount() {
        return foodInfoMapper.ProductCount();
    }
}
