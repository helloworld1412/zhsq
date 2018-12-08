package com.monster.zhaqsq.test;

import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.dao.UserBasicMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class LoginTest {

    @Autowired
    UserBasicMapper userbasicMapper;

    @Test
    public void testL(){

    }
}
