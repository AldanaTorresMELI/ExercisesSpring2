package com.example.spring2.dtos.request.house;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;

@Data
@Validated
public class House {

    @NotBlank(message = "El nombre esta vacío")
    private String name;

    @NotNull(message = "Debe ingresar una dirección")
    @NotBlank(message = "La dirección esta vacía")
    private String adress;

    @NotEmpty(message = "Esta colección esta vacía")
    @Valid
    private ArrayList<Room> listRooms;

}
