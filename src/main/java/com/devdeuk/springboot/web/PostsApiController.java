package com.devdeuk.springboot.web;

import com.devdeuk.springboot.service.posts.PostsService;
import com.devdeuk.springboot.web.dto.PostsResponseDto;
import com.devdeuk.springboot.web.dto.PostsSaveRequestDto;
import com.devdeuk.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Created by devdeuk@kakao.com on 2020-06-27
 * Github : http://github.com/devdeuk
 */
@RequiredArgsConstructor //선언된 모든 final 필드가 포함된 생성자를 생성해줌
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }


    /**
     * 수정하기
     * @auther d e v d e u k
     * @version 1.0
     * @Date 2020-09-02 오후 11:51
     * @desc
     **/
    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }


    /** 삭제하기
     * @auther d e v d e u k
     * @version 1.0
     * @Date 2020-09-03 오후 7:37
     * @desc
     **/
    @DeleteMapping("/api/v1/posts/{id}")
    public Long Delete(@PathVariable Long id){
        postsService.delete(id);
        return id;
    }




    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }


}
