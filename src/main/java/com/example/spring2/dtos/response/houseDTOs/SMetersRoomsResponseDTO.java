package com.example.spring2.dtos.response.houseDTOs;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class SMetersRoomsResponseDTO {
    ArrayList<MetersRoomDTO> rooms;
}
