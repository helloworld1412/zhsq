package com.monster.zhaqsq.test;

import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.dao.UserBasicMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Scanner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class RegisterTest {

    @Autowired
    UserBasicMapper userbasicMapper;

    @Test
    public void testR(){
        userbasicMapper.insertSelective(new UserBasic(null, "test", "12345", "123", null, null, null, null, null, null, null));
        System.out.println("注册成功！");
    }
}
