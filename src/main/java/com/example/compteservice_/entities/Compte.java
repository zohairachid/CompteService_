package com.example.compteservice_.entities;

import com.example.compteservice_.enums.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private double solde;
    private Date DateCreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;


}
