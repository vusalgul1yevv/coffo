package az.edu.itbrains.coffee_web.services;

import az.edu.itbrains.coffee_web.DTOs.response.BlogResponseDto;
import az.edu.itbrains.coffee_web.DTOs.response.MenuItemResponseDto;

public interface MenuItemService {
    MenuItemResponseDto getMenuItemInfo();
    MenuItemResponseDto getMenuItemId(Long id);
    MenuItemResponseDto createMenuItem(BlogResponseDto menuItemResponseDto);
    MenuItemResponseDto updateMenuItem(Long id, BlogResponseDto menuItemResponseDto);
    void deleteMenuItem(Long id);
}
