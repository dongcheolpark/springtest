package org.pdc.testspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("Hello")
    public String hello(Model model) {
        return "/view/hello.html";
    }
}
