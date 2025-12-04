package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.DTOs.response.BlogResponseDto;
import az.edu.itbrains.coffee_web.entities.Blog;
import az.edu.itbrains.coffee_web.repositories.AboutRepository;
import az.edu.itbrains.coffee_web.repositories.BlogRepository;
import az.edu.itbrains.coffee_web.services.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;

    @Override
    public BlogResponseDto getBlogId(Long id) {
        Blog blog = blogRepository.findById(id).orElse(null);

        return null;
    }

    @Override
    public BlogResponseDto createBlog(BlogResponseDto blogResponseDto) {
        Blog blog = new Blog();
        blog.setTitle(blogResponseDto.getTitle());
        blog.setDescription(blogResponseDto.getDescription());
        blog.setImageUrl(blogResponseDto.getImageUrl());
        Blog savedBlog = blogRepository.save(blog);
        return new BlogResponseDto(
                savedBlog.getId(),
                savedBlog.getTitle(),
                savedBlog.getDescription(),
                savedBlog.getImageUrl(),
                savedBlog.getCreatedAt()
        );

    }

    @Override
    public BlogResponseDto updateBlog(Long id, BlogResponseDto blogResponseDto) {
        Blog blog = blogRepository.findById(id).orElse(null);
        if(blog == null){
            return null;
        }

        blog.setTitle(blogResponseDto.getTitle());
        blog.setDescription(blogResponseDto.getDescription());
        blog.setImageUrl(blogResponseDto.getImageUrl());
        Blog savedBlog = blogRepository.save(blog);
        return new BlogResponseDto(
                savedBlog.getId(),
                savedBlog.getTitle(),
                savedBlog.getDescription(),
                savedBlog.getImageUrl(),
                savedBlog.getCreatedAt()
        );

    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }
}