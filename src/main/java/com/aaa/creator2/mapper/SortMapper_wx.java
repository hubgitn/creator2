package com.aaa.creator2.mapper;

import com.aaa.creator2.entity.Sort;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SortMapper_wx {
   public List<Sort> selSort();
}
