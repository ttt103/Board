package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor  //기본 생성자 추가
@ToString
@Entity
public class Article {
    @Id //엔티티의 대표값 지정
    @GeneratedValue //자동생성기능 추가(숫자가 자동으로 매겨짐)
    private Long Id;
    @Column //title 필드 선언. db테이블의 title열과 연결
    private String title;
    @Column
    private String content;


}