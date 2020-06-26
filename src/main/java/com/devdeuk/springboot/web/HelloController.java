package com.devdeuk.springboot.web;

import com.devdeuk.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by devdeuk@kakao.com on 2020-06-26
 * Github : http://github.com/devdeuk
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto (@RequestParam(value = "name", required = false) String name,
                                      @RequestParam(value = "amount", required = false) int amount){

        return new HelloResponseDto(name, amount);
    }
}

/*
@RequestParam
    - 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
    - 여기서는 외부에서 name(@requestParam("name")) 이란 이름으로 넘긴 파라미터를 메소드 파라미터 name(String name)에 저장


 */