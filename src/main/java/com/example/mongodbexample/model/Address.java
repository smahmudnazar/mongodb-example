package com.example.mongodbexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 14:16 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    private String city,state,pincode;
}
