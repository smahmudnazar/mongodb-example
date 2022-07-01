package com.example.mongodbexample.component;

import com.example.mongodbexample.model.Address;
import com.example.mongodbexample.model.Gender;
import com.example.mongodbexample.model.Student;
import com.example.mongodbexample.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 21:06 *
 */
@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final MongoTemplate mongoTemplate;
    private final StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {
        Address address = Address.builder()
                .city("Madeira")
                .country("Portugal")
                .postCode("CR&")
                .build();

        Student student = Student.builder()
                .firstName("Cristiano")
                .lastName("Ronaldo")
                .email("cr7@gmail.com")
                .gender(Gender.MALE)
                .address(address)
                .favouriteSubjects(List.of("Football", "Business"))
                .totalSpentInBooks(BigDecimal.TEN)
                .created(LocalDateTime.now())
                .build();

        Query query=new Query();
        query.addCriteria(Criteria.where("email").is(student.getEmail()));

        List<Student> students = mongoTemplate.find(query, Student.class);

        if (students.size()>1){
            throw new IllegalStateException("found may students with email "+ student.getEmail());
        }
        if (students.isEmpty()){
            System.out.println("Inserting... ");
            studentRepository.insert(student);
        }else {
            System.out.println("Already exists");
        }

    }
}
