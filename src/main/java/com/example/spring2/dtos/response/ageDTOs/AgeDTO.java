package com.example.spring2.dtos.response.ageDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AgeDTO {
    private String date;
    private int age;
}
