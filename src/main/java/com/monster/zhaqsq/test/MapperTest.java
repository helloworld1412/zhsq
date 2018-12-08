/*2018.12.7
* 黄金峰
* 测试*/

package com.monster.zhaqsq.test;

import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.bean.UserBasicExample;
import com.monster.zhaqsq.controller.UserBasicController;
import com.monster.zhaqsq.dao.UserBasicMapper;
import com.monster.zhaqsq.service.UserBasicService;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})



public class MapperTest {


    @Autowired
    UserBasicService userbasicService;

    @Autowired
    UserBasicMapper userbasicMapper;


    @Test
    public void insert(){
        /*新增记录*/
        userbasicMapper.insertSelective(new UserBasic(null, "test", "12345", "123", null, null, null, null, null, null, null));
    }

    @Test
    public void update(){
        /*修改个人信息*/
        UserBasic userbasic = new UserBasic();
        userbasic.setUid(2);
        userbasic.setUserName("test");
        userbasic.setUserSex("男");
        userbasic.setUserDesp("描述");
        userbasic.setUserMessagelevel("1");
        userbasicService.updateInfo(userbasic);
    }

    @Test
    public void select() {
        /*查询个人信息*/
        System.out.println(userbasicService.getinfo());
    }

    @Test
    public void delete() {
        /*删除记录*/
        userbasicService.deleteuser(3);
    }
}
