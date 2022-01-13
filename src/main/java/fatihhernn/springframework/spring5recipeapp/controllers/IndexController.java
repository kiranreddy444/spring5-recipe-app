package fatihhernn.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String getPageIndex(){
        System.out.println("Some message to say .. 234");
        return "index";
    }
}
