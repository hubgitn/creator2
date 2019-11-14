package com.aaa.creator2.service;

import com.aaa.creator2.mapper.OrderitemMapper_wx;
import com.aaa.creator2.mapper.delOrderitemMapper_wx;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class delOrderitemServiceImpl_wx implements delOrderitemService_wx{
    @Resource
    private delOrderitemMapper_wx delOrderitemMapper_wx;
    @Override
    public int delOrder(Integer omid) {
        return delOrderitemMapper_wx.delOrder(omid);
    }
}
