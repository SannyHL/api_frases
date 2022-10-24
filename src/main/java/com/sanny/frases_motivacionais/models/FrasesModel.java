package com.sanny.frases_motivacionais.models;

import javax.persistence.*;

@Entity
@Table(name = "frases")
public class FrasesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String frase;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public FrasesModel(Long id, String frase) {
        this.id = id;
        this.frase = frase;
    }
    public FrasesModel(){
    }

    
    
    
}
