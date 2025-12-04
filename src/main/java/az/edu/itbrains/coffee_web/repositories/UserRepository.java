package az.edu.itbrains.coffee_web.repositories;

import az.edu.itbrains.coffee_web.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
