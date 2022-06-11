package com.example.mongodbexample.controller;

import com.example.mongodbexample.model.User;
import com.example.mongodbexample.repository.FlipkartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author * Sunnatullayev Mahmudnazar *  * mongodb-example *  * 14:21 *
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class FlipkartController {

    private final FlipkartRepository flipkartRepository;

    @PostMapping("/placedOrderNow")
    public String placeOrder(@RequestBody User user){
        flipkartRepository.save(user);
        return "Order placed success!";
    }

    @GetMapping("/getByName/{name}")
    public List<User> getByName(@PathVariable String name){
        return flipkartRepository.findByName(name);
    }

    @GetMapping("/getByCity/{city}")
    public List<User> getByCity(@PathVariable String city){
        return flipkartRepository.findByCity(city);
    }
}
