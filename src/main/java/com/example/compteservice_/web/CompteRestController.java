package com.example.compteservice_.web;

import com.example.compteservice_.entities.Compte;
import com.example.compteservice_.repositories.CompteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class CompteRestController {

    private CompteRepository compteRepository;

    public CompteRestController(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }
    @GetMapping(path = "/comptes")
    public List<Compte> listeCompte(){
        return compteRepository.findAll();
    }
    @GetMapping(path = "/comptes/{id}")
    public Compte getCompte(@PathVariable(name = "id") Long code){
        return compteRepository.findById(code).get();
    }
    @PostMapping(path = "comptes/")
    public Compte save(@RequestBody Compte cp){
        return compteRepository.save(cp);
    }
    @PutMapping(path = "comptes/{code}")
    public Compte update(@PathVariable Long code, @RequestBody Compte cp){
        cp.setCode(code);
        return compteRepository.save(cp);
    }
    @DeleteMapping(path = "comptes/{code}")
    public void  delete(@PathVariable Long code){
        compteRepository.deleteById(code);
    }
}
