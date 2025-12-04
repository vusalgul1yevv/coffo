package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.repositories.ContactRepository;
import az.edu.itbrains.coffee_web.repositories.MenuItemRepository;
import az.edu.itbrains.coffee_web.services.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuItemServiceImpl implements MenuItemService {
    private final MenuItemRepository menuItemRepository;
}
