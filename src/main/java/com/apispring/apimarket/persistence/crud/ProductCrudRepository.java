package com.apispring.apimarket.persistence.crud;

import com.apispring.apimarket.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {
}
