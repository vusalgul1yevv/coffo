package az.edu.itbrains.coffee_web.repositories;

import az.edu.itbrains.coffee_web.entities.Testimonials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestimonialsRepository extends JpaRepository<Testimonials,Long> {
}
