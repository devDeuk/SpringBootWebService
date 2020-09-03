package com.devdeuk.springboot.config.auth;

import com.devdeuk.springboot.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by devdeuk@kakao.com on 2020-09-04
 * Github : http://github.com/devdeuk
 */
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOauth2UserService customOauth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable().headers().frameOptions().disable()                                            //h2-console 화면을 사용하기 위해 해당 옵션들을 disable
                .and()
                    .authorizeRequests()                                                                       //URL별 권한과니를 설정하는 옵션의 시작점
                    .antMatchers("/","/css/**","/images/**","/js/**","/h2-console/**").permitAll()  //전체열람가능
                    .antMatchers("/api/v1/**").hasRole(Role.USER.name())                            //POST 메소드이면서 "/api/v1/**" 주소를 가진 API USER 권한을 가진 사람만 가능하도록 했음
                    .anyRequest().authenticated()                                                              //설정된 값들 이외 나머지 URL들을 나타냅니다.
                .and()
                    .logout()
                        .logoutSuccessUrl("/")                                                                  //로그아웃 기느에 대한 여러 설정 진입점
                .and()
                    .oauth2Login()                                                                              //OAuth2 로그인 기능에 대한 여러 설정 진입점
                        .userInfoEndpoint()                                                                     //OAuth2  로그인 성공 이후 사용자 정보를 가져올 때의 설정들을 담당합니다.
                            .userService(customOauth2UserService);                                              //소셜로그인 성공 시 후속 조치를 진행할 UserService 인터페이스의 구현체를 등록합니다.
    }

}
