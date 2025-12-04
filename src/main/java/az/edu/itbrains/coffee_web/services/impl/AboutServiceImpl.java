package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.DTOs.response.AboutResponseDto;
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
    public AboutResponseDto getAboutInfo(Long id) {
        return aboutRepository.getAboutInfo(id);    }
}
