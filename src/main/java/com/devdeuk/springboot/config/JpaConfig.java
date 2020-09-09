package com.devdeuk.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by devdeuk@kakao.com on 2020-09-08
 * Github : http://github.com/devdeuk
 */
@Configuration
@EnableJpaAuditing //JPA auditing활성화
public class JpaConfig { }