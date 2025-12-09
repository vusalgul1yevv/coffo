package az.edu.itbrains.coffee_web.repositories;

import az.edu.itbrains.coffee_web.DTOs.response.BlogResponseDto;
import az.edu.itbrains.coffee_web.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Long> {
//    BlogResponseDto createBlog(BlogResponseDto blogResponseDto);
}
