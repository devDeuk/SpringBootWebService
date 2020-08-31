package com.devdeuk.springboot.service.posts;

import com.devdeuk.springboot.domain.posts.Posts;
import com.devdeuk.springboot.domain.posts.PostsRepository;
import com.devdeuk.springboot.web.dto.PostsResponseDto;
import com.devdeuk.springboot.web.dto.PostsSaveRequestDto;
import com.devdeuk.springboot.web.dto.PostsUpdateRequestDto;
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


    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }


    @Transactional
    public PostsResponseDto findById(Long id){
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id="+ id));

        return new PostsResponseDto(entity);
    }

}
