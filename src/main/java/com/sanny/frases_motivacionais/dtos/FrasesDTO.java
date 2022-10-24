package com.sanny.frases_motivacionais.dtos;

public class FrasesDTO {

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
    
    public FrasesDTO(Long id, String frase) {
        this.id = id;
        this.frase = frase;
    }
    public FrasesDTO(){
    }
}
