package com.kt.edu.firstproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity //DB가 해당 객체 인식 가능!
@AllArgsConstructor
@NoArgsConstructor // 디폴트 생성자 추가
@ToString
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // + 전략 추가(자동 생성 전략) // 1, 2, 3, ... 자동 생성 해주는 어노테이션!
    @Getter
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    public void patch(Article article) {
        if (article.title != null)
            this.title = article.title;
        if (article.content != null)
            this.content = article.content;
    }

//
//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }
//
//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
