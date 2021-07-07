package com.example.spring2.controllers;

import com.example.spring2.dtos.request.house.House;
import com.example.spring2.dtos.response.houseDTOs.BiggestRoomResponseDTO;
import com.example.spring2.dtos.response.houseDTOs.HousePriceResponseDTO;
import com.example.spring2.dtos.response.houseDTOs.MetersResponseDTO;
import com.example.spring2.dtos.response.houseDTOs.SMetersRoomsResponseDTO;
import com.example.spring2.handlers.HouseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/house")
public class HouseCalculatorController {

    //Se pide, retornar un objeto que
    //diga la cantidad totales de metros cuadrados de la casa.
    @PostMapping("/calculateMeters")
    public ResponseEntity<MetersResponseDTO> calculateMeters(@Valid @RequestBody House house){
        MetersResponseDTO metersResponseDTO = new MetersResponseDTO(
                HouseHandler.calculateMeters(house.getListRooms())
        );

        return new ResponseEntity<>(metersResponseDTO, HttpStatus.OK);
    }

    //Indicar el valor de la casa tomando en cuenta que
    // se toma como referencia USD 800 el metro cuadrado.
    @PostMapping("/calculatePrice")
    public ResponseEntity<HousePriceResponseDTO> calculatePrice(@Valid @RequestBody House house){
        HousePriceResponseDTO housePriceResponseDTO = new HousePriceResponseDTO(
                HouseHandler.calculateMeters(house.getListRooms()), HouseHandler.calculatePrice(house.getListRooms())
        );

        return new ResponseEntity<>(housePriceResponseDTO, HttpStatus.OK);
    }

    //Retornar el objeto con la habitación más grande.
    @PostMapping("/biggestRoom")
    public ResponseEntity<BiggestRoomResponseDTO> findBiggestRoom(@Valid @RequestBody House house){
        BiggestRoomResponseDTO biggestRoomResponseDTO = new BiggestRoomResponseDTO(
                HouseHandler.findBiggestRoom(house.getListRooms())
        );
        return new ResponseEntity<>(biggestRoomResponseDTO, HttpStatus.OK);
    }

    //Retornar la cantidad de metros cuadrados por habitación.
    @PostMapping("/squareMetersRooms")
    public ResponseEntity<SMetersRoomsResponseDTO> metersRooms(@Valid @RequestBody House house){
        SMetersRoomsResponseDTO sMetersRoomsResponseDTO = new SMetersRoomsResponseDTO(
          HouseHandler.calculateMetersRooms(house.getListRooms())
        );
        return new ResponseEntity<>(sMetersRoomsResponseDTO, HttpStatus.OK);
    }
}
