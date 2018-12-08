package com.monster.zhaqsq.dao;

import com.monster.zhaqsq.bean.CallList;
import com.monster.zhaqsq.bean.CallListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallListMapper {
    long countByExample(CallListExample example);

    int deleteByExample(CallListExample example);

    int deleteByPrimaryKey(Integer callId);

    int insert(CallList record);

    int insertSelective(CallList record);

    List<CallList> selectByExample(CallListExample example);

    CallList selectByPrimaryKey(Integer callId);

    int updateByExampleSelective(@Param("record") CallList record, @Param("example") CallListExample example);

    int updateByExample(@Param("record") CallList record, @Param("example") CallListExample example);

    int updateByPrimaryKeySelective(CallList record);

    int updateByPrimaryKey(CallList record);
}