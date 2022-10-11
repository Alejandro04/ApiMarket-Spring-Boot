package com.apispring.apimarket.persistence.crud;

import com.apispring.apimarket.persistence.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(int idCategory){
        return productCrudRepository.findByIdCategory(idCategory);
    }

    public List<Product> getByCategoryOrderByNameAsc(int idCategory){
        return productCrudRepository.findByIdCategoryOrderByNameAsc(idCategory);
    }

    public Optional<Product> getProductById(int idProduct){
        return productCrudRepository.findById(idProduct);
    }

    public Product saveProduct(Product product){
        return productCrudRepository.save(product);
    }

    public void delete(int idProduct){
        productCrudRepository.deleteById(idProduct);
    }
}
