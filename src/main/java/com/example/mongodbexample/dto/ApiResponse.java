package com.example.mongodbexample.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 16:26 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ApiResponse<T> {
    private String message;
    private boolean success;
    private T data;
}
