package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Article {
    @Id //엔티티의 대표값 지정
    @GeneratedValue //자동생성기능 추가(숫자가 자동으로 매겨짐)
    private Long Id;
    @Column //title 필드 선언. db테이블의 title열과 연결
    private String title;
    @Column
    private String content;


    public Article(Long id, String content, String title) {
        this.Id = id;
        this.content = content;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Article{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
