package com.example.spring2.dtos.request.house;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class Room {

    @NotBlank(message = "El nombre esta vacío")
    private String name;

    @NotNull(message = "El ancho de la habitación no esta definido")
    private int width; //ancho

    @NotNull(message = "El largo de la habitación no esta definido")
    private int length; //largo
}
