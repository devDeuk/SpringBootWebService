package com.devdeuk.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by devdeuk@kakao.com on 2020-06-26
 * Github : http://github.com/devdeuk
 */
//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
