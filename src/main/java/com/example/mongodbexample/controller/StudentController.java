package com.example.mongodbexample.controller;

import com.example.mongodbexample.dto.ApiResponse;
import com.example.mongodbexample.dto.StudentDTO;
import com.example.mongodbexample.model.Student;
import com.example.mongodbexample.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        ApiResponse<?> response = studentService.getAll();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable String id){
        ApiResponse<?> response = studentService.getOne(id);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody StudentDTO dto){
        ApiResponse<?> response = studentService.add(dto);
        return ResponseEntity.ok().body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> edit(@RequestBody StudentDTO dto,@PathVariable String id){
        ApiResponse<?> response = studentService.edit(dto,id);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable String id){
        ApiResponse<?> response = studentService.deleteById(id);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAll(){
        ApiResponse<?> response = studentService.deleteAll();
        return ResponseEntity.ok().body(response);
    }

}
