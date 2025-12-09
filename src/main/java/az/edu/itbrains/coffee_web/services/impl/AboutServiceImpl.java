package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.DTOs.response.AboutResponseDto;
import az.edu.itbrains.coffee_web.DTOs.response.BlogResponseDto;
import az.edu.itbrains.coffee_web.entities.About;
import az.edu.itbrains.coffee_web.entities.Blog;
import az.edu.itbrains.coffee_web.repositories.AboutRepository;
import az.edu.itbrains.coffee_web.services.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AboutServiceImpl implements AboutService {
    private final AboutRepository aboutRepository;

    @Override
    public AboutResponseDto getAboutId(Long id) {
        About about = aboutRepository.findById(id).orElse(null);
        if(about == null){
            return null;
        }
        return null;
    }

    @Override
    public AboutResponseDto createBlog(BlogResponseDto blogResponseDto) {
        return null;
    }

    @Override
    public AboutResponseDto updateBlog(Long id, BlogResponseDto blogResponseDto) {
        return null;
    }

    @Override
    public void deleteBlog(Long id) {

    }

    @Override
    public AboutResponseDto getAboutInfo(long l) {
        return null;
    }
}
