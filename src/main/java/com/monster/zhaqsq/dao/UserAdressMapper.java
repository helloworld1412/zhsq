package com.monster.zhaqsq.dao;

import com.monster.zhaqsq.bean.UserAdress;
import com.monster.zhaqsq.bean.UserAdressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAdressMapper {
    long countByExample(UserAdressExample example);

    int deleteByExample(UserAdressExample example);

    int deleteByPrimaryKey(Integer id);

    //根据username删除地址
    int deleteWithUsername(String username);

    int insert(UserAdress record);

    int insertSelective(UserAdress record);

    List<UserAdress> selectByExample(UserAdressExample example);

    UserAdress selectByPrimaryKey(Integer id);

    
    //根据username查找地址
    UserAdress selectWithUsername(String userName);
    
    //只更新地址
    int updateOnlyAdress(@Param("adress")String adress,@Param("userName") String userName);

    int updateByExampleSelective(@Param("record") UserAdress record, @Param("example") UserAdressExample example);

    int updateByExample(@Param("record") UserAdress record, @Param("example") UserAdressExample example);

    int updateByPrimaryKeySelective(UserAdress record);

    int updateByPrimaryKey(UserAdress record);
}