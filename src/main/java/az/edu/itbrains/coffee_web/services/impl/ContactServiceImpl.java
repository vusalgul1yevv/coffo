package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.repositories.BlogRepository;
import az.edu.itbrains.coffee_web.repositories.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl {
    private final ContactRepository contactRepository;
}
