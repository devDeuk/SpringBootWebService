package com.devdeuk.springboot.service.posts;

import com.devdeuk.springboot.domain.posts.PostsRepository;
import com.devdeuk.springboot.web.dto.PostsSaveRequestDto;
import com.sun.istack.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by devdeuk@kakao.com on 2020-06-27
 * Github : http://github.com/devdeuk
 */
//선언된 모든 final 필드가 포함된 생성자를 생성해줌
@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;


    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

}
