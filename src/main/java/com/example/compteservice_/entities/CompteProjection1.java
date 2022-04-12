package com.example.compteservice_.entities;

import com.example.compteservice_.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p2", types = Compte.class)
public interface CompteProjection1 {
    public  Long getCode();
    public TypeCompte getType();
}
