package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.DTOs.response.AboutResponseDto;
import az.edu.itbrains.coffee_web.DTOs.response.BlogResponseDto;
import az.edu.itbrains.coffee_web.entities.About;
import az.edu.itbrains.coffee_web.repositories.AboutRepository;
import az.edu.itbrains.coffee_web.services.AboutService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AboutServiceImpl implements AboutService {
    private final AboutRepository aboutRepository;
    private final ModelMapper modelMapper;

    @Override
    public AboutResponseDto getAboutInfo() {
        About about = aboutRepository.findAll().stream().findFirst().orElse(null);
        if(about != null){
            return modelMapper.map(about, AboutResponseDto.class);
        }
        return null;
    }

    @Override
    public AboutResponseDto getAboutId(Long id) {
        return null;
    }

    @Override
    public AboutResponseDto createBlog(BlogResponseDto aboutResponseDto) {
        About about = new About();
        about.setTitle(aboutResponseDto.getTitle());
        about.setDescription(aboutResponseDto.getDescription());
        about.setImageUrl(aboutResponseDto.getImageUrl());
        About savedAbout = aboutRepository.save(about);
        return modelMapper.map(savedAbout, AboutResponseDto.class);
    }

    @Override
    public AboutResponseDto updateBlog(Long id, BlogResponseDto aboutResponseDto) {
        About about = aboutRepository.findById(id).orElse(null);
        if(about == null){
            return null;
        }
        about.setTitle(aboutResponseDto.getTitle());
        about.setDescription(aboutResponseDto.getDescription());
        about.setImageUrl(aboutResponseDto.getImageUrl());
        About savedBlog = aboutRepository.save(about);
        return modelMapper.map(savedBlog, AboutResponseDto.class);
    }

    @Override
    public void deleteBlog(Long id) {
    }

}
