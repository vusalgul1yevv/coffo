package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.DTOs.response.MenuItemResponseDto;
import az.edu.itbrains.coffee_web.DTOs.response.BlogResponseDto;
import az.edu.itbrains.coffee_web.entities.MenuItem;
import az.edu.itbrains.coffee_web.repositories.MenuItemRepository;
import az.edu.itbrains.coffee_web.repositories.ContactRepository;
import az.edu.itbrains.coffee_web.repositories.MenuItemRepository;
import az.edu.itbrains.coffee_web.services.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuItemServiceImpl implements MenuItemService {
    private final MenuItemRepository menuItemRepository;
    private final ModelMapper modelMapper;

    @Override
    public MenuItemResponseDto getMenuItemInfo() {
        MenuItem menuItem = menuItemRepository.findAll().stream().findFirst().orElse(null);
        if(menuItem != null){
            return modelMapper.map(menuItem, MenuItemResponseDto.class);
        }
        return null;
    }

    @Override
    public MenuItemResponseDto getMenuItemId(Long id) {
        return null;
    }

    @Override
    public MenuItemResponseDto createMenuItem(BlogResponseDto menuItemResponseDto) {
        MenuItem menuItem = new MenuItem();
        menuItem.setTitle(menuItemResponseDto.getTitle());
        menuItem.setDescription(menuItemResponseDto.getDescription());
        menuItem.setImageUrl(menuItemResponseDto.getImageUrl());
        MenuItem savedMenuItem = menuItemRepository.save(menuItem);
        return modelMapper.map(savedMenuItem, MenuItemResponseDto.class);
    }

    @Override
    public MenuItemResponseDto updateMenuItem(Long id, BlogResponseDto menuItemResponseDto) {
        MenuItem menuItem = menuItemRepository.findById(id).orElse(null);
        if(menuItem == null){
            return null;
        }
        menuItem.setTitle(menuItemResponseDto.getTitle());
        menuItem.setDescription(menuItemResponseDto.getDescription());
        menuItem.setImageUrl(menuItemResponseDto.getImageUrl());
        MenuItem savedBlog = menuItemRepository.save(menuItem);
        return modelMapper.map(savedBlog, MenuItemResponseDto.class);
    }

    @Override
    public void deleteMenuItem(Long id) {

    }

    @Override
    public void deleteBlog(Long id) {
    }
}
