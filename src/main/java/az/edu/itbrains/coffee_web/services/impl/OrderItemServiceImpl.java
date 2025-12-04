package az.edu.itbrains.coffee_web.services.impl;

import az.edu.itbrains.coffee_web.repositories.OrderRepository;
import az.edu.itbrains.coffee_web.services.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {
    private final OrderRepository orderRepository;
}
