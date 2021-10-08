package com.test.redol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// index 페이지의 경우 따로 매핑해주지 않아도 알아서 이동함
// html 에서 href로 url 매핑 해주면됨

@Controller
public class PageController {

    // about 페이지
    @GetMapping("/about")           // url 매핑
    public String about() {         // page 이름
        return "about";             // 연결할 html 파일의 이름 .html 을 제외해야함
    }

    // services 페이지
    @GetMapping("/services")
    public String services() {
        return "services";
    }

    // blog 페이지
    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    // contact 페이지
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}