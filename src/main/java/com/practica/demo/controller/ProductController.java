package com.practica.demo.controller;

import com.practica.demo.model.Product;
import com.practica.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller Product.
 *
 * @author luiggi
 */
@RestController
@RequestMapping("/v1/products")
public class ProductController {

    /**
     * Dependency Injection Repository.
     */
    @Autowired
    private ProductRepo repository;

    /**
     * Service get all products.
     *
     * @return List Products
     */
    @GetMapping(path = "/get-all")
    public List<Product> getAllProducts() {
        return repository.findAll();
        //return Arrays.asList(new Product(1, "Television"), new Product(2, "Radio"));
    }

    /**
     * Service get product.
     *
     * @param id id
     * @return product
     */
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Integer id) {
        return repository.findById(id).orElse(new Product());
    }

    /**
     * Method post to save product.
     *
     * @param product {@Link Product}
     * @return {@Link Product}
     */
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Product saveProduct(@RequestBody final Product product) {
        return repository.save(product);
    }
}