package com.example.mongodbexample.repository;

import com.example.mongodbexample.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 14:21 *
 */
public interface FlipkartRepository extends MongoRepository<User,Integer> {
    List<User> findByName(String name);

    @Query("{'Address.city':?0}")
    List<User> findByCity(String city);
}
