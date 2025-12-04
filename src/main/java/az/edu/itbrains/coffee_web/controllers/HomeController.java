package az.edu.itbrains.coffee_web.controllers;

import az.edu.itbrains.coffee_web.DTOs.response.AboutResponseDto;
import az.edu.itbrains.coffee_web.DTOs.response.TestimonialsResponseDto;
import az.edu.itbrains.coffee_web.services.AboutService;
import az.edu.itbrains.coffee_web.services.TestimonialsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final AboutService aboutService;
    private final TestimonialsService testimonialsService;
    private final ModelMapper modelMapper;
    @GetMapping("/")
    public String home(Model model){
        AboutResponseDto aboutResponseDto = aboutService.getAboutInfo(1L);
        model.addAttribute("aboutInfo",aboutResponseDto);

        List<TestimonialsResponseDto> testimonialsResponseDtos = testimonialsService.getAll();
        return "index";
    }
}
