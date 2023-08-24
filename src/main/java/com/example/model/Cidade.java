package com.example.model;

public class Cidade {
    private Long id;
    private String name;
    private Estado estado;
    private boolean capital;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public boolean isCapital() {
        return capital;
    }
    public void setCapital(boolean capital) {
        this.capital = capital;
    }    
}
