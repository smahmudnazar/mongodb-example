package com.example.mongodbexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 14:15 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private Integer quantity;
    private Double price;
}
