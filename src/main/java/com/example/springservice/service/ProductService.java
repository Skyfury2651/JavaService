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

    public List<Product> getAllProducts(){
        return  productRepository.findAll();
    }

    public Product sellProduct(int productId,int quantity){
        Product product = productRepository.getById(productId);
        product.setQuantity(product.getQuantity() - quantity);

        return  productRepository.save(product);
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }
}
