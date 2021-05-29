package com.practica.demo.repository;

import com.practica.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Class Repository Product.
 * interface jpa
 *
 * @author Luiggi
 */
public interface ProductRepo extends JpaRepository<Product, Integer> {
}