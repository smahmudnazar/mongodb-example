package com.example.mongodbexample.dto;

import com.example.mongodbexample.model.Address;
import com.example.mongodbexample.model.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 16:31 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {
    private String firstName, lastName;
    private String email;
    private Gender gender;
    private Address address;
    private List<String> favouriteSubjects;
    private BigDecimal totalSpentInBooks;
}
