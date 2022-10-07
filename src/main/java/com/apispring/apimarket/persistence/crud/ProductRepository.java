package com.apispring.apimarket.persistence.crud;

import com.apispring.apimarket.persistence.entity.Product;

import java.util.List;

public class ProductRepository {

    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }
}
