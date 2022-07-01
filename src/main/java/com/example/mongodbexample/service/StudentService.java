package com.example.mongodbexample.service;

import com.example.mongodbexample.model.Student;
import com.example.mongodbexample.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 16:18 *
 */
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
