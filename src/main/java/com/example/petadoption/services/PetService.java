package com.example.petadoption.services;

import com.example.petadoption.models.PetDTO;

import java.util.List;

public interface PetService {

    Long createPet(PetDTO petDTO);

    List<PetDTO> getAllPets();
}
