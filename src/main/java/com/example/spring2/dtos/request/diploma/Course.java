package com.example.spring2.dtos.request.diploma;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class Course {

    @NotNull(message = "El nombre de la materia no puede ser nulo")
    private String name;

    @NotNull(message = "La nota no puede ser nula")
    private double score;
}
