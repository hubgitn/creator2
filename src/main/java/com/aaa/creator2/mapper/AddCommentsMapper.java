package com.aaa.creator2.mapper;

import com.aaa.creator2.entity.Comments;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddCommentsMapper {
    public int addComments(Comments comments);
}
