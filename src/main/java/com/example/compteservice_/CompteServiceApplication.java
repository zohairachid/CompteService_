package com.example.compteservice_;

import com.example.compteservice_.entities.Compte;
import com.example.compteservice_.enums.TypeCompte;
import com.example.compteservice_.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class CompteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CompteRepository compteRepository, RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Compte.class);
            compteRepository.save(new Compte(null,2334,new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null,2334,new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null,2334,new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null,2334,new Date(), TypeCompte.COURANT));
            compteRepository.findAll().forEach(cp -> {
                System.out.println(cp.getCode());
                System.out.println(cp.getSolde());
                System.out.println();
            });
        };
    }
}
