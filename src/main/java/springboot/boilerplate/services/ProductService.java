package springboot.boilerplate.services;

import springboot.boilerplate.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();

    Optional<Product> getProductById(Long id);

    Product saveProduct(Product product);

    void deleteProduct(Long id);

    Product updateProduct(Long id, Product updatedProduct);
}
