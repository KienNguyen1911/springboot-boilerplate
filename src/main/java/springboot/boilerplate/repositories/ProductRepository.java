package springboot.boilerplate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.boilerplate.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
