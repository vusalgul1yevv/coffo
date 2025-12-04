package az.edu.itbrains.coffee_web.repositories;

import az.edu.itbrains.coffee_web.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
