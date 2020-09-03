package com.devdeuk.springboot.service.posts;

import com.devdeuk.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * Created by devdeuk@kakao.com on 2020-08-31
 * Github : http://github.com/devdeuk
 */
@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
