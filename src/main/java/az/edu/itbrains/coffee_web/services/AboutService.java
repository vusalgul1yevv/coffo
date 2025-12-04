package az.edu.itbrains.coffee_web.services;

import az.edu.itbrains.coffee_web.DTOs.response.AboutResponseDto;

public interface AboutService {
    AboutResponseDto getAboutInfo(Long id);
}
