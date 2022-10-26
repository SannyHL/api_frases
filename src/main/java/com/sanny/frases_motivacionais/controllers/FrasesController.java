package com.sanny.frases_motivacionais.controllers;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sanny.frases_motivacionais.dtos.FrasesDTO;
import com.sanny.frases_motivacionais.models.FrasesModel;
import com.sanny.frases_motivacionais.services.FrasesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/frases")
@Api(value = "Frases Controller")
@CrossOrigin
public class FrasesController {
    
    private static final String ID = "/id";
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private FrasesService service;

    @GetMapping
    @ApiOperation(value = "Buscar todos")
    public ResponseEntity<List<FrasesDTO>> findAll(){
        return ResponseEntity.ok().body(service.findAll().stream().map(x -> mapper.map(x, FrasesDTO.class)).collect(Collectors.toList()));
    }
    
    @GetMapping(ID)
    @ApiOperation(value = "Buscar por id")
    public ResponseEntity<FrasesDTO> findById(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok().body(mapper.map(service.findById(id), FrasesDTO.class));
    }
    
    @PostMapping
    @ApiOperation(value = "Criar nova frase")
    public ResponseEntity<FrasesDTO> create(@RequestBody FrasesDTO frasesDTO){
        FrasesModel frasesModel = service.create(frasesDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path(ID).buildAndExpand(frasesModel.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    
    @PutMapping(ID)
    @ApiOperation(value = "Atualizar")
    public ResponseEntity<FrasesDTO> update(@PathVariable Long id, @RequestBody FrasesDTO frasesDTO) throws Exception{
        findById(id);
        frasesDTO.setId(id);
        return ResponseEntity.ok().body(mapper.map(service.update(frasesDTO), FrasesDTO.class));
    }
    
    @DeleteMapping(ID)
    @ApiOperation(value = "Deletar")
    public ResponseEntity<FrasesDTO> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
