package com.devdeuk.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by devdeuk@kakao.com on 2020-09-03
 * Github : http://github.com/devdeuk
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
