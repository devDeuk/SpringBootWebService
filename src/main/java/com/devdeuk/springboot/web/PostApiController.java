package com.devdeuk.springboot.web;

import com.devdeuk.springboot.service.posts.PostsService;
import com.devdeuk.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by devdeuk@kakao.com on 2020-06-27
 * Github : http://github.com/devdeuk
 */
@RequiredArgsConstructor //선언된 모든 final 필드가 포함된 생성자를 생성해줌
@RestController
public class PostApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }


}
