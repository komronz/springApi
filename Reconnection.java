package com.springdemo.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Reconnection {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/students/all")
    public ResponseEntity getAll(){
        List<Object> list = new ArrayList<>();
        list.add(
                new students(1L,
                        "testname",
                        "testsurname",
                        "testfather_name1",
                        1,
                        "Java Back-end")
        );

        return ResponseEntity.ok(list);
    }
}
