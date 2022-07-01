package com.example.mongodbexample.repository;

import com.example.mongodbexample.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 15:49 *
 */
public interface StudentRepository extends MongoRepository<Student,String> {

    Optional<Student> findStudentByEmail(String email);
}
