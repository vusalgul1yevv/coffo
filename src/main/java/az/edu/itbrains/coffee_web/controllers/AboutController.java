package az.edu.itbrains.coffee_web.controllers;

import az.edu.itbrains.coffee_web.DTOs.response.AboutResponseDto;
import az.edu.itbrains.coffee_web.repositories.AboutRepository;
import az.edu.itbrains.coffee_web.services.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/about")
public class AboutController {
    private final AboutService aboutService;

    @GetMapping
    public String about(Model model){
        AboutResponseDto aboutResponseDto = aboutService.getAboutInfo();
        model.addAttribute("aboutInfo",aboutResponseDto);
        return "about";
    }
}
