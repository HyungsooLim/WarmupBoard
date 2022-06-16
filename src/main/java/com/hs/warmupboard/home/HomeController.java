package com.hs.warmupboard.home;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") // RequestMapping URI 를 지정
@CrossOrigin(value = "http://localhost:3000")
public class HomeController {

    @GetMapping("/") // http://localhost:8080/api/hello
    public String goHome() {
        return "axios test";
    }

}
