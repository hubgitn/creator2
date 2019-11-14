package com.aaa.creator2.service;
import com.aaa.creator2.entity.Order;
import com.aaa.creator2.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements  OrderService{
    @Resource
    private OrderMapper orderMapper;


    @Override
    public List<Order> getOrderById(Integer uid) {
        return orderMapper.getOrderById(uid);
    }
}
