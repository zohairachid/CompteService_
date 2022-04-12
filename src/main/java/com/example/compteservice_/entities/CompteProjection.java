package com.example.compteservice_.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1", types = Compte.class)
public interface CompteProjection {
    public  Long getCode();
    public double getSolde();
}
