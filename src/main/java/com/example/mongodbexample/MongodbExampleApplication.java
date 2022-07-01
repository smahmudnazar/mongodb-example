package com.example.mongodbexample;

import com.example.mongodbexample.model.Address;
import com.example.mongodbexample.model.Gender;
import com.example.mongodbexample.model.Student;
import com.example.mongodbexample.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class MongodbExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbExampleApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(StudentRepository studentRepository, MongoTemplate mongoTemplate){
//        return args -> {
//            Address address = Address.builder()
//                    .city("Madeira")
//                    .country("Portugal")
//                    .postCode("CR&")
//                    .build();
//
//            Student student = Student.builder()
//                    .firstName("Cristiano")
//                    .lastName("Ronaldo")
//                    .email("cr7@gmail.com")
//                    .gender(Gender.MALE)
//                    .address(address)
//                    .favouriteSubjects(List.of("Football", "Business"))
//                    .totalSpentInBooks(BigDecimal.TEN)
//                    .created(LocalDateTime.now())
//                    .build();
//
//            Query query=new Query();
//            query.addCriteria(Criteria.where("email").is(student.getEmail()));
//
//            List<Student> students = mongoTemplate.find(query, Student.class);
//
//            if (students.size()>1){
//                throw new IllegalStateException("found may students with email "+ student.getEmail());
//            }
//            if (students.isEmpty()){
//                System.out.println("Inserting... ");
//                studentRepository.insert(student);
//            }else {
//                System.out.println("Already exists");
//            }
//
//
//        };
//    }

}
