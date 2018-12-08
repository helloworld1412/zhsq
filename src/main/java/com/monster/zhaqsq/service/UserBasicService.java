/*2018.12.7
* 黄金峰
* 服务层*/

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

    /*得到用户个人信息*/
    public List<UserBasic> getinfo() {
        List<UserBasic> list = userbasicMapper.selectPersonalInfoByExample(null);
        return list;
    }

    /*更新用户信息*/
    public void updateInfo(UserBasic userbasic) {
        userbasicMapper.updateByPrimaryKeySelective(userbasic);
    }

    /*删除用户*/
    public void deleteuser(int uid){
        userbasicMapper.deleteByPrimaryKey(uid);
    }

}
