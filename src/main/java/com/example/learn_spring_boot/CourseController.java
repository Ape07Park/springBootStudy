package com.example.learn_spring_boot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

 public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourse() {

        return Arrays.asList(
                new Course(1, "learn AWS", "in28"),
                new Course(2, "learn java", "in28"),
                new Course(3,"learn Spring Boot", "in28"),
                new Course(4, "learn JS", "in28")
        );


    }
}
