package com.sanny.frases_motivacionais.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanny.frases_motivacionais.models.FrasesModel;

public interface FrasesRepository extends JpaRepository<FrasesModel, Long>{
    
}
