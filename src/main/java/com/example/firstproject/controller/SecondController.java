package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SecondController {
    @GetMapping("/random-quote")
    public String randomQuote(Model model) {
        String[] quotes = {
                "행복은 습관이다. 그것을 몸에 지니라." + "-허버드-",
                "고개 숙이지 마십시오. 세상을 똑바로 정면으로 " + "-헬렌 켈러-",
                "고난의 시기에 동요하지 않는 것, 이것은 진정 " + "칭찬받을 만한 뛰어난 인물의 증거다. -베토벤"
        };
        int randInt = (int) (Math.random() * quotes.length);
        model.addAttribute("randomQuote", quotes[randInt]);
        return "quote";
    }
}
