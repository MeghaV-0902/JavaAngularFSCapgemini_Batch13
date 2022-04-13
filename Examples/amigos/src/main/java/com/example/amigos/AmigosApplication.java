package com.example.amigos;

import com.example.amigos.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class AmigosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigosApplication.class, args);
    }

}
