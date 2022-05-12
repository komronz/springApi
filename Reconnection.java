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
    List<Object> list = new ArrayList<>();
    @GetMapping("/students/all")
    public ResponseEntity getAll(){
        list.add(
                new students(
                        1L,
                        "testname",
                        "testsurname",
                        "testfathernaem",
                        "JavaCore",
                        1,
                        "Security of services"
                )
        );

        return ResponseEntity.ok(list);
    }
    @GetMapping("/students/java_course")
    public ResponseEntity getJavaCoursePeople(){
        List<Object> list_onlyJavaCourse = new ArrayList<>();

        list_onlyJavaCourse.add("");
        return null;
    }
}
