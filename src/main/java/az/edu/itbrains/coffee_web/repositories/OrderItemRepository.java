package az.edu.itbrains.coffee_web.repositories;

import az.edu.itbrains.coffee_web.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
