package com.example.spring2.controllers;

import com.example.spring2.dtos.response.ageDTOs.AgeDTO;
import com.example.spring2.handlers.AgeHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("age")
public class AgeCalculatorController {

    @GetMapping("/calculateAge/{day}/{month}/{year}")
    public ResponseEntity<AgeDTO> calculateAge(@PathVariable("day") int day, @PathVariable("month" ) int month, @PathVariable("year") int year){
        AgeDTO ageDTO = new AgeDTO(
            day + "/" + month + "/" + year, AgeHandler.calculateAge(day, month, year)
        );
        return new ResponseEntity<>(ageDTO, HttpStatus.OK );
    }
}
