package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.DTOs.response.TestimonialsResponseDto;
import az.edu.itbrains.coffee_web.entities.Testimonials;
import az.edu.itbrains.coffee_web.repositories.TestimonialsRepository;
import az.edu.itbrains.coffee_web.services.TestimonialsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TestimonialsServiceImpl implements TestimonialsService {
    private final TestimonialsRepository testimonialsRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<TestimonialsResponseDto> getAll() {
        return testimonialsRepository.findAll()
                .stream()
                .map(testimonials -> modelMapper.map(testimonials, TestimonialsResponseDto.class))
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public void saveTestimonials(Testimonials testimonials) {
        testimonialsRepository.save(testimonials);
    }


}
