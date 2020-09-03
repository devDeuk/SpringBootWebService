package com.devdeuk.springboot.config.auth.dto;

import com.devdeuk.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by devdeuk@kakao.com on 2020-09-04
 * Github : http://github.com/devdeuk
 */
@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;


    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
