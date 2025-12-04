package az.edu.itbrains.coffee_web.services;

import az.edu.itbrains.coffee_web.DTOs.response.BlogResponseDto;

public interface BlogService {
    BlogResponseDto getBlogId(Long id);
    BlogResponseDto createBlog(BlogResponseDto blogResponseDto);
    BlogResponseDto updateBlog(Long id,BlogResponseDto blogResponseDto);
    void deleteBlog(Long id);
}
