package az.edu.itbrains.coffee_web.repositories;

import az.edu.itbrains.coffee_web.DTOs.response.AboutResponseDto;
import az.edu.itbrains.coffee_web.entities.About;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepository extends JpaRepository<About,Long> {
    AboutResponseDto getAboutInfo(Long id);
}
