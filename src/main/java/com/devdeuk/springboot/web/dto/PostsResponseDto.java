package com.devdeuk.springboot.web.dto;

import com.devdeuk.springboot.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created by devdeuk@kakao.com on 2020-06-30
 * Github : http://github.com/devdeuk
 */
@Getter
@NoArgsConstructor
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
   }

}
