package com.xyh.mapper;

import com.xyh.domain.Detailed;
import com.xyh.domain.DetailedExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetailedMapper {
    int countByExample(DetailedExample example);

    int deleteByExample(DetailedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Detailed record);

    int insertSelective(Detailed record);

    List<Detailed> selectByExample(DetailedExample example);

    Detailed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Detailed record, @Param("example") DetailedExample example);

    int updateByExample(@Param("record") Detailed record, @Param("example") DetailedExample example);

    int updateByPrimaryKeySelective(Detailed record);

    int updateByPrimaryKey(Detailed record);
}