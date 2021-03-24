package se.lexion.workshop_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller // controllers are input handlers - all request will get in controller java classes first
public class HomeController {

    @RequestMapping("/")
    public String goToIndexPage(){
        System.out.println("####### goToIndexPage");
        return "index";
    }

}

