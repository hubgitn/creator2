package com.aaa.creator2.service;
import com.aaa.creator2.entity.Comments;
import com.aaa.creator2.mapper.AddCommentsMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class AddCommentsServiceImpl implements AddCommentsService {
    @Resource
    private AddCommentsMapper addCommentsMapper;
    @Override
    public int addComments(Comments comments) {
        return addCommentsMapper.addComments(comments);
    }
}
