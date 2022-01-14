package com.example.petadoption.controllers;

import com.example.petadoption.models.PetDTO;
import com.example.petadoption.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pet")
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService){
        this.petService = petService;
    }

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createPet(@RequestBody  PetDTO petDTO){
        Long petID = petService.createPet(petDTO);

        return new ResponseEntity<>("Pet with id:" + petID, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<PetDTO>> getAllPets(){
        return new ResponseEntity<>(petService.getAllPets(), HttpStatus.OK);
    }
}
