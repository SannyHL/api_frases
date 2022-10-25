package com.sanny.frases_motivacionais.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanny.frases_motivacionais.dtos.FrasesDTO;
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
        return null;
    }

    @Override
    public FrasesModel create(FrasesDTO frasesDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public FrasesModel update(FrasesDTO frasesDTO) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
