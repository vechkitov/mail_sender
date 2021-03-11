package com.ss.mailsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2
public class MailSenderApplication {

    public static void main(String[] args) {
        // checking application config
        ConfigValidator cv = new ConfigValidator();
        int configStatus = cv.configValidator();

        // status code = 0 - config valid, else invalid
        if (configStatus == 0){
            SpringApplication.run(MailSenderApplication.class, args);
        }
    }
}
