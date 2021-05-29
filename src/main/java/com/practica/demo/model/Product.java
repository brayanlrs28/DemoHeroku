package com.practica.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

/**
 * Bean Class Product
 * define product descriptions.
 *
 * @author Luiggi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    private Integer id;

    @Column(length = 30)
    private String name;
}
    /*@Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "product", schema = "dbo")
    public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", length = 30, columnDefinition = "varchar")
    private String name;
}*/
