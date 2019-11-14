package com.aaa.creator2.service;

import com.aaa.creator2.entity.Sort;
import com.aaa.creator2.mapper.SortMapper_wx;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class SortServiceImpl_wx implements SortService_wx {
    @Resource
    private SortMapper_wx sortMapper_wx;
    @Override
    public List<Sort> selSort() {
        return sortMapper_wx.selSort();
    }
}
