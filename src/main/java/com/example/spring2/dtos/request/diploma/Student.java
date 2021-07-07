package com.example.spring2.dtos.request.diploma;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Student {
    @NotNull(message = "El nombre del alumno debe estar")
    private String name;

    @NotEmpty(message = "No puede estar vacio")
    @Valid
    private ArrayList<Course> listCourses;
}
