package com.example.compteservice_.dtos;

import lombok.Data;

@Data
public class VirementRequestDto {
    private  Long codeSource;
    private  Long codeDest;
    private double montant;
}
