package com.example.petadoption.controllers;

import com.example.petadoption.models.AdoptionRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("adoption/request")
public class AdoptionRequestController {

    @GetMapping()
    public ResponseEntity<String> getAdoptionRequests(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{adoptionRequestId}")
    public ResponseEntity<String> getAdoptionRequestById(@PathVariable(value = "adoptionRequestId") long adoptionRequestId){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{petType}")
    public ResponseEntity<String> getAdoptionRequestsByPetType(@PathVariable(value = "petType") String petType){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<String> createAdoptionRequest(@RequestBody AdoptionRequestDTO adoptionRequestDTO){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{petType}")
    public ResponseEntity<String> updateAdoptionRequesStatus(@RequestBody AdoptionRequestDTO adoptionRequestDTO){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
