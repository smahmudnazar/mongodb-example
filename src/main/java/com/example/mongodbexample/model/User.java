package com.example.mongodbexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 14:13 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "order_DB")
public class User {
    @Id
    private Integer id;
    private String name,gender;

    private List<Product> products;
    private Address address;
}
