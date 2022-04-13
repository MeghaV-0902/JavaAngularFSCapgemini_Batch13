package com.example.formValidation;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.*;
import javax.validation.constraints.*;

import java.time.LocalDate;

@Data
public class Student
{
    @NotNull(message = "Name cannot be null")
    @NotEmpty(message = "Name cannot be empty")
    private String name;
    @NotNull(message = "Choose the number of subjects you are going to study")
    @Min(value=4,message = "Student should enroll in minimum 4 subjetcs")
    @Max(value = 8, message = "Student can enroll a maximum of 8 subjetcs")
    private int subjectCount;
    @NotNull
    @Min(value = 1)
    @Max(12)
    private int grade;
    @NotNull
    @Size(max=10, min=10, message = "Mobile number should be of 10 digits")
    @Pattern(regexp = "[7-9][0-9]{9}", message = "Mobile number is invalid!!")
    private String mobileNo;
    @NotNull(message = "Please enter birth date")
    @Past(message = "Birth date should be less than current date!!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;


}
