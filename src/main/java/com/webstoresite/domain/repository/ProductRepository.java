package com.webstoresite.domain.repository;


import com.webstoresite.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
