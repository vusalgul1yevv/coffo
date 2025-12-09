package az.edu.itbrains.coffee_web.services;

import az.edu.itbrains.coffee_web.DTOs.response.AboutResponseDto;
import az.edu.itbrains.coffee_web.DTOs.response.BlogResponseDto;

public interface AboutService {
    AboutResponseDto getAboutId(Long id);
    AboutResponseDto createBlog(BlogResponseDto blogResponseDto);
    AboutResponseDto updateBlog(Long id,BlogResponseDto blogResponseDto);
    void deleteBlog(Long id);

    AboutResponseDto getAboutInfo(long l);
}
