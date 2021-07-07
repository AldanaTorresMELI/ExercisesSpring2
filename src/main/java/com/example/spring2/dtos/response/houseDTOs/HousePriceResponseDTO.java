package com.example.spring2.dtos.response.houseDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HousePriceResponseDTO {

    private int meters;
    private String price;
}
