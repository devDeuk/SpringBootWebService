package com.devdeuk.springboot.web;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by devdeuk@kakao.com on 2020-07-01
 * Github : http://github.com/devdeuk
 */
@NoArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
