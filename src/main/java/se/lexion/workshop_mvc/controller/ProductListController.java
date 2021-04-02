package se.lexion.workshop_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // controllers are input handlers - all request will get in controller java classes first
public class ProductListController {

    @RequestMapping("/list")
    public String goToIndexPage(){
        return "list";
    }
}

