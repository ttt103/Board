package com.example.firstproject.dto;

//폼 데이터를 받아오는 그릇
public class ArticleForm {
    private String title;  //제목을 받는 필드
    private String content; //내용을 받는 필드


    //생성자 추가
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleFrom{" +
                "tittle='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
