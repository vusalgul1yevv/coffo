package az.edu.itbrains.coffee_web.repositories;

import az.edu.itbrains.coffee_web.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
