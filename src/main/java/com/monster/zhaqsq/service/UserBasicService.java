package com.monster.zhaqsq.service;

import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.dao.UserBasicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserBasicService {

    @Autowired
    UserBasicMapper userbasicMapper;

    public List<UserBasic> getinfo() {
        List<UserBasic> list = userbasicMapper.selectPersonalInfoByExample(null);
        return list;
    }

    public void updateInfo(UserBasic userbasic) {
        userbasicMapper.updateByPrimaryKeySelective(userbasic);
    }

    public void deleteuser(int uid){
        userbasicMapper.deleteByPrimaryKey(uid);
    }

}
