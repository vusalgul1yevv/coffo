package az.edu.itbrains.coffee_web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ContactController {
    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }
}
