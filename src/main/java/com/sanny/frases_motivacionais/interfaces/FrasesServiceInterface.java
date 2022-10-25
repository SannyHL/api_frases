package com.sanny.frases_motivacionais.interfaces;

import java.util.List;

import com.sanny.frases_motivacionais.dtos.FrasesDTO;
import com.sanny.frases_motivacionais.models.FrasesModel;

public interface FrasesServiceInterface {
    
    List<FrasesModel> findAll();
    FrasesModel findById(Long id);
    FrasesModel create(FrasesDTO frasesDTO);
    void delete(Long id);
    FrasesModel update(FrasesDTO frasesDTO);
}
