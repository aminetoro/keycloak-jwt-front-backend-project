package com.lary.inventroy_service.web;

import com.lary.inventroy_service.entities.Product;
import com.lary.inventroy_service.repository.ProductRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableMethodSecurity
@CrossOrigin("*")
@RequestMapping("/api")
public class ProductRestController {
     private ProductRepository productRepository;
     public ProductRestController(ProductRepository productRepository){
          this.productRepository = productRepository;
     }

     @GetMapping("/products")
//     @PreAuthorize("hasAuthority('USER')")
     public List<Product> getAllProducts(){
           return productRepository.findAll();

     }
     @GetMapping("/products/{id}")
     public Product getProductbyId(@PathVariable String id){
         return productRepository.findById(id).get();
     }
     @GetMapping("auth")
     public Authentication authentication(Authentication authentication){
          return authentication;
     }

}
