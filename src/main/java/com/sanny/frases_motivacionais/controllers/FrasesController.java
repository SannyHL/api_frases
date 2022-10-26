package com.sanny.frases_motivacionais.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanny.frases_motivacionais.dtos.FrasesDTO;
import com.sanny.frases_motivacionais.services.FrasesService;

@RestController
@RequestMapping("/frases")
public class FrasesController {
    
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private FrasesService service;

    @GetMapping
    public ResponseEntity<List<FrasesDTO>> findAll(){
        return ResponseEntity.ok().body(service.findAll().stream().map(x -> mapper.map(x, FrasesDTO.class)).collect(Collectors.toList()));
    }
}
