package com.apispring.apimarket.persistence.crud;

import com.apispring.apimarket.persistence.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

    // we can use
    // @Query(value="SELECT * FROM products WHERE id_category = ?", nativeQuery = true)
    List<Product> findByIdCategory(int idCategory);
    List<Product> findByIdCategoryOrderByNameAsc(int idCategory);
}
