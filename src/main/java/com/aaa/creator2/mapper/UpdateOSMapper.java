package com.aaa.creator2.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UpdateOSMapper {
    public int updateOS(Integer oid);
}
