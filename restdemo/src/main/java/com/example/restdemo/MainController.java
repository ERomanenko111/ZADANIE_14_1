package com.example.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class MainController {

    private Person person;

    @GetMapping("/person")
    public Person getPerson() {
        return new Person(1, "Ivanov", "Ivan", "Ivanovich", LocalDate.of(1999, 06, 07));
    }

    @GetMapping
    public String hello() {
        return "Hello, World!";
    }
}