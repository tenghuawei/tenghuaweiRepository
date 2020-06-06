package com.thw.maildemo.sendmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SendmailApplication {
    @RequestMapping("hello")
    public  String get(){
        return "thw ni hao!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SendmailApplication.class, args);
    }

}
