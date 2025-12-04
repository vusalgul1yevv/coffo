package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.repositories.MenuItemRepository;
import az.edu.itbrains.coffee_web.repositories.OrderRepository;
import az.edu.itbrains.coffee_web.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
}
