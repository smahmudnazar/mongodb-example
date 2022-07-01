package com.example.mongodbexample.controller;

import com.example.mongodbexample.model.Student;
import com.example.mongodbexample.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 16:17 *
 */
@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<Student> all = studentService.getAll();
        return ResponseEntity.ok().body(all);
    }

}
