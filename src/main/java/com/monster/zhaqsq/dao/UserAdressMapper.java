package com.monster.zhaqsq.dao;

import com.monster.zhaqsq.bean.UserAdress;
import com.monster.zhaqsq.bean.UserAdressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAdressMapper {
    long countByExample(UserAdressExample example);

    int deleteByExample(UserAdressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAdress record);

    int insertSelective(UserAdress record);

    List<UserAdress> selectByExample(UserAdressExample example);

    UserAdress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAdress record, @Param("example") UserAdressExample example);

    int updateByExample(@Param("record") UserAdress record, @Param("example") UserAdressExample example);

    int updateByPrimaryKeySelective(UserAdress record);

    int updateByPrimaryKey(UserAdress record);
}