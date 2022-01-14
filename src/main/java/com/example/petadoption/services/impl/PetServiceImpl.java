package com.example.petadoption.services.impl;

import com.example.petadoption.models.PetDTO;
import com.example.petadoption.models.entities.Pet;
import com.example.petadoption.repositories.PetRepository;
import com.example.petadoption.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    @Autowired
    public PetServiceImpl(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    @Override
    public Long createPet(PetDTO petDTO) {

        Pet pet = new Pet();
        pet.setBirthDate(petDTO.getBirthDate());
        pet.setSpecie(petDTO.getSpecie());

        pet = petRepository.save(pet);

        return pet.getId();
    }

    @Override
    public List<PetDTO> getAllPets() {
        List<PetDTO> petDTOList = new ArrayList<>();

        petRepository.findAll().forEach(pet -> {
            PetDTO petDTO = new PetDTO();
            petDTO.setBirthDate(pet.getBirthDate());
            petDTO.setSpecie(pet.getSpecie());
            petDTOList.add(petDTO);
        });

        return petDTOList;
    }
}
