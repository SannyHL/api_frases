package com.sanny.frases_motivacionais.services;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanny.frases_motivacionais.dtos.FrasesDTO;
import com.sanny.frases_motivacionais.exceptions.ObjectNotFoundException;
import com.sanny.frases_motivacionais.interfaces.FrasesServiceInterface;
import com.sanny.frases_motivacionais.models.FrasesModel;
import com.sanny.frases_motivacionais.repositories.FrasesRepository;

@Service
public class FrasesService implements FrasesServiceInterface{

    @Autowired
    public FrasesRepository repository;
    @Autowired
    public ModelMapper mapper;

    @Override
    public List<FrasesModel> findAll() {
        return repository.findAll();
    }

    @Override
    public FrasesModel findById(Long id) {
        Optional<FrasesModel> frasesOptinal = repository.findById(id);
        return frasesOptinal.orElseThrow(() -> new ObjectNotFoundException("Id não encontrado"));
    }

    @Override
    public FrasesModel create(FrasesDTO frasesDTO) {
        return repository.save(mapper.map(frasesDTO, FrasesModel.class));
    }

    @Override
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
        
    }

    @Override
    public FrasesModel update(FrasesDTO frasesDTO) {
        return repository.save(mapper.map(frasesDTO, FrasesModel.class));
    }
    
}
