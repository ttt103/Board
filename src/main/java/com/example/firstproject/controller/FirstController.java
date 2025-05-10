package com.example.firstproject.controller;

//컨트롤러 어노테이션 작성하면 자동 생성됨.

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;    //모델 클래스 자동 임포트

@Controller
public class FirstController {

    @GetMapping("/hi")  //URL 요청 접수
    public String niceToMeetYou(Model model) {  //model 객체 받아오기
        model.addAttribute("username", "곰고고마");
        //greetings.mustache 파일 반환
        return "greetings"; //서버가 알아서 templates 디렉토리에서 해당 파일을 찾아 웹 브라우저로 전송
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "곰고고마ㅃ2");
        return "goodbye";
    }

}
