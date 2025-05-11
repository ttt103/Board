package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;


//폼 데이터를 받아오는 그릇
@AllArgsConstructor
@ToString
public class ArticleForm {
    private String title;  //제목을 받는 필드
    private String content; //내용을 받는 필드

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
