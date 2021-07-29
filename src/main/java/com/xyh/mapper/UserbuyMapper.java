package com.xyh.mapper;

import com.xyh.domain.Userbuy;
import com.xyh.domain.UserbuyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserbuyMapper {
    int countByExample(UserbuyExample example);

    int deleteByExample(UserbuyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userbuy record);

    int insertSelective(Userbuy record);

    List<Userbuy> selectByExample(UserbuyExample example);

    Userbuy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userbuy record, @Param("example") UserbuyExample example);

    int updateByExample(@Param("record") Userbuy record, @Param("example") UserbuyExample example);

    int updateByPrimaryKeySelective(Userbuy record);

    int updateByPrimaryKey(Userbuy record);

    List<Userbuy> selbyname(String username);
}