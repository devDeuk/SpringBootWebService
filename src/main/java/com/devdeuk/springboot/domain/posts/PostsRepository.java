package com.devdeuk.springboot.domain.posts;

import com.devdeuk.springboot.web.dto.PostsUpdateRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by devdeuk@kakao.com on 2020-06-26
 * Github : http://github.com/devdeuk
 */
public interface PostsRepository extends JpaRepository<Posts,Long> {

}
