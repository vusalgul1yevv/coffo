package az.edu.itbrains.coffee_web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MenuItemController {
    @GetMapping("/coffees")
    public String coffees(){
        return "coffees";
    }
}
