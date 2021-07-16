package com.example.springservice.service;


import com.example.springservice.ProductRepo;
import com.example.springservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

@Component(value = "productService")
@WebService
public class ProductService {

    private ProductRepo productRepository;

    public List<Product> all(){
        return  productRepository.findAll();
    }

    public Product updateOrUpdate(Product product){
        return productRepository.save(product);
    }
}
