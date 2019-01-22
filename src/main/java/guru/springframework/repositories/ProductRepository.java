package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import guru.springframework.domain.Product;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
