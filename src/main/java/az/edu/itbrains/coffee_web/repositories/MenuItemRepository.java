package az.edu.itbrains.coffee_web.repositories;

import az.edu.itbrains.coffee_web.entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem,Long> {
}
