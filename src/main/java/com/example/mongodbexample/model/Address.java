package com.example.mongodbexample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 14:16 *
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Address {
    private String city,country,postCode;
}
