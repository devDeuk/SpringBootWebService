package com.devdeuk.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

/**
 * Created by devdeuk@kakao.com on 2020-06-26
 * Github : http://github.com/devdeuk
 */
public interface PostsRepository extends JpaRepository<Posts,Long> {

    @Query(value = "SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

}


