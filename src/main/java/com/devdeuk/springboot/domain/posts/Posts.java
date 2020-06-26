package com.devdeuk.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by devdeuk@kakao.com on 2020-06-26
 * Github : http://github.com/devdeuk
 */

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

}

/*
1. @Entity
 - 테이블과 링크될 크래스임을 나타냄
 - 기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍으로 테이블 이름을 매칭함다
    ex) SaleManager.java -> sales_manager table

2. @Id
 - 해당 테이블의 PK필드를 나타낸다.

3. @GeneratedValue
 - PK의 생성 규칙을 나타냄
 - 스트링부트 2.0에서 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment가 됨

4. @Column
 - 테이블의 칼럼을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 컬럼이 됨
 - 사용하는 이유는, 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용함
 - 무자열의 경우 VARCHAR(255)가 기본값인데, 사이즈를 500으로 늘리고 싶거나 (ex:title), 타입을 TEXT로 변경하고 싶거나(ex:content)등의 경우에 사용

5. @NoArgsConstructor
 - 기본 생성자 자동 추가
 - public Posts(){} 와 같은 효과

6. @Getter
 - 클래스 내 모든 필드의 Getter 메소드를 자동생성

7. @Builder
 - 해당 클래스의 빌더 패턴 클래스를 생성
 - 생성자 상단에 선언시 생성자에 포함된 필드만 빌더에 포함



*/