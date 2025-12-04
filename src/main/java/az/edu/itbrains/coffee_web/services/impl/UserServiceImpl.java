package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.repositories.TestimonialsRepository;
import az.edu.itbrains.coffee_web.repositories.UserRepository;
import az.edu.itbrains.coffee_web.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
}
