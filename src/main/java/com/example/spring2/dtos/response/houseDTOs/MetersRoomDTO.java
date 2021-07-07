package com.example.spring2.dtos.response.houseDTOs;

import com.example.spring2.dtos.request.Room;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MetersRoomDTO {
    private Room room;
    private int meters;
}
