package com.thw.maildemo.sendmail.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @PROJECT_NAME: SpringBootSendmail
 * @PACKAGE_NAME: com.thw.maildemo.sendmail.service
 * @ClassName: SendMyMailOneTest
 * @User: ZARD
 * @Author:tenghw
 * @Description:
 * @CreateDate:2020/5/2 0002 00:17
 * @Day: 星期六
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class SendMyMailOneTest {
    @Autowired
    private  SendMyMailOne sendMyMailOne;
    @Test
    public  void  setSendMyMailOne(){
        sendMyMailOne.setJavaMailSender("1073932229@qq.com","1906531697@qq.com",
                                        "验证码测试","this is my springboot confirmcode demo!");
    }
}