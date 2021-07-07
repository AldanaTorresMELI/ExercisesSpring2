package com.example.spring2.dtos.response.diplomaDTOs;

import com.example.spring2.dtos.request.diploma.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiplomaResponseDTO {

    private String message;
    private double average;
    private Student student;
    private String congrats;

    public DiplomaResponseDTO(String message, double average, Student student) {
        this.message = message;
        this.average = average;
        this.student = student;
    }
}
