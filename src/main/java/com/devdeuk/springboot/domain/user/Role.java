package com.devdeuk.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by devdeuk@kakao.com on 2020-09-03
 * Github : http://github.com/devdeuk
 */
@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST","손님"),
    USER("ROLE_USER","일반사용자");

    private final String key;
    private final String title;

}
