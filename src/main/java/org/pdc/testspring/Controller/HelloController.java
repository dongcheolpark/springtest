package org.pdc.testspring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("Hello")
    public String hello(Model model){
        model.addAttribute("data","hello,world!");
        return "/view/home/hello";
    }
}
