package com.example.compteservice_.web;

import com.example.compteservice_.dtos.VirementRequestDto;
import com.example.compteservice_.services.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    @Autowired
    private CompteService compteService;

    @PutMapping(path = "/comptes/virement")
    public void virement(@RequestBody VirementRequestDto requestDto){
        compteService.virement(requestDto.getCodeSource(),requestDto.getCodeDest(),requestDto.getMontant());
    }
}
