package com.example.mongodbexample.service;

import com.example.mongodbexample.dto.ApiResponse;
import com.example.mongodbexample.dto.StudentDTO;
import com.example.mongodbexample.model.Student;
import com.example.mongodbexample.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 16:18 *
 */
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public ApiResponse<?> getAll() {
        return ApiResponse.builder().message("Here").success(true).data( studentRepository.findAll()).build();
    }


    public ApiResponse<?> getOne(String id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isEmpty()) return ApiResponse.builder().message("Not Found").success(false).build();

        return ApiResponse.builder().success(true).message("Here").data(optionalStudent.get()).build();
    }

    public ApiResponse<?> add(StudentDTO dto) {

        Student student = Student.builder()
                .totalSpentInBooks(dto.getTotalSpentInBooks())
                .favouriteSubjects(dto.getFavouriteSubjects())
                .address(dto.getAddress())
                .gender(dto.getGender())
                .email(dto.getEmail())
                .lastName(dto.getLastName())
                .firstName(dto.getFirstName())
                .created(LocalDateTime.now())
                .build();

        studentRepository.save(student);
        return ApiResponse.builder().message("Saved").success(true).build();
    }

    public ApiResponse<?> edit(StudentDTO dto, String id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isEmpty()) return ApiResponse.builder().message("Not Found").success(false).build();

        Student student = optionalStudent.get();
        student.setAddress(dto.getAddress());
        student.setEmail(dto.getEmail());
        student.setFavouriteSubjects(dto.getFavouriteSubjects());
        student.setGender(dto.getGender());
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setTotalSpentInBooks(dto.getTotalSpentInBooks());

        studentRepository.save(student);

        return ApiResponse.builder().message("Edited").success(true).build();
    }

    public ApiResponse<?> deleteById(String id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isEmpty()) return ApiResponse.builder().message("Not Found").success(false).build();

        studentRepository.deleteById(id);
        return ApiResponse.builder().message("Deleted").success(true).build();

    }

    public ApiResponse<?> deleteAll() {
        studentRepository.deleteAll();
        return ApiResponse.builder().message("Deleted").success(true).build();
    }
}
