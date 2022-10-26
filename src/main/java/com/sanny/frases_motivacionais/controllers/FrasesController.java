package com.sanny.frases_motivacionais.controllers;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sanny.frases_motivacionais.dtos.FrasesDTO;
import com.sanny.frases_motivacionais.models.FrasesModel;
import com.sanny.frases_motivacionais.services.FrasesService;

@RestController
@RequestMapping("/frases")
public class FrasesController {
    
    private static final String ID = "/id";
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private FrasesService service;

    @GetMapping
    public ResponseEntity<List<FrasesDTO>> findAll(){
        return ResponseEntity.ok().body(service.findAll().stream().map(x -> mapper.map(x, FrasesDTO.class)).collect(Collectors.toList()));
    }

    @GetMapping(ID)
    public ResponseEntity<FrasesDTO> findById(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok().body(mapper.map(service.findById(id), FrasesDTO.class));
    }

    @PostMapping
    public ResponseEntity<FrasesDTO> create(@RequestBody FrasesDTO frasesDTO){
        FrasesModel frasesModel = service.create(frasesDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path(ID).buildAndExpand(frasesModel.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
