package com.example.spring2.controllers;

import com.example.spring2.dtos.request.diploma.Course;
import com.example.spring2.dtos.request.diploma.Student;
import com.example.spring2.dtos.response.diplomaDTOs.DiplomaResponseDTO;
import com.example.spring2.handlers.DiplomaHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/diploma")
public class DiplomaController {

    @PostMapping("/createDiploma")
    public ResponseEntity<DiplomaResponseDTO> create(@Valid @RequestBody Student student){
        DiplomaResponseDTO diplomaResponseDTO =
            new DiplomaResponseDTO(
                    "Tu promedio final es: ", DiplomaHandler.average(student),
                    student, DiplomaHandler.congrats(student));

    return new ResponseEntity<>(diplomaResponseDTO, HttpStatus.OK);
    }
}
