package com.example.petadoption.controllers;

import com.example.petadoption.models.AdoptionRequestDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@ExtendWith(MockitoExtension.class)
class AdoptionRequestControllerTest {

    @InjectMocks
    AdoptionRequestController adoptionRequestController;

    @Test
    public void getAdoptionRequestsTest(){
        List<AdoptionRequestDTO> adoptionRequestDTOS = new ArrayList<>();

        AdoptionRequestDTO adoptionRequestDTO = new AdoptionRequestDTO();
        AdoptionRequestDTO adoptionRequestDTO1 = new AdoptionRequestDTO();
        AdoptionRequestDTO adoptionRequestDTO2 = new AdoptionRequestDTO();

        assertEquals("should be true", false, true);
    }
}