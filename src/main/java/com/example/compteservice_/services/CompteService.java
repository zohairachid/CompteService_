package com.example.compteservice_.services;

public interface CompteService {
    public void virement(Long codeSource, Long codeDest, double montant);
}
