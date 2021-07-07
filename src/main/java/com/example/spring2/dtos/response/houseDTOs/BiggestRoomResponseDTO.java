package com.example.spring2.dtos.response.houseDTOs;

import com.example.spring2.dtos.request.house.Room;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BiggestRoomResponseDTO {
    private Room room;
}
