package com.example.amigos.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService
{
    public List<Student> getsStudents()
    {
        return List.of(new Student(1L,"Megha","meg@g.com", LocalDate.of(2001,2,9),21));
    }
}
