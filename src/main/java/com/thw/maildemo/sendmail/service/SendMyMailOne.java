package com.thw.maildemo.sendmail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: SpringBootSendmail
 * @PACKAGE_NAME: com.thw.maildemo.sendmail.service
 * @ClassName: SendMyMailOne
 * @User: ZARD
 * @Author:tenghw
 * @Description:
 * @CreateDate:2020/5/2 0002 00:11
 * @Day: 星期六
 */
@Service
public class SendMyMailOne {
    @Autowired
    private JavaMailSender javaMailSender;
    public  void setJavaMailSender(String from,String to,String subject,String content){
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);

        javaMailSender.send(simpleMailMessage);
    }
}
