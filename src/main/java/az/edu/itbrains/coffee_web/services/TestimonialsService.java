package az.edu.itbrains.coffee_web.services;

import az.edu.itbrains.coffee_web.DTOs.response.TestimonialsResponseDto;
import az.edu.itbrains.coffee_web.entities.Testimonials;

import java.util.List;

public interface TestimonialsService {
    List<TestimonialsResponseDto> getAll();
    void saveTestimonials(Testimonials testimonials);
}
