package com.example.model;

import java.util.Date;

public class Loja {
    private Long id;
    private Cidade cidade;
    private Date dataDeInauguracao;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public Date getDataDeInauguracao() {
        return dataDeInauguracao;
    }
    public void setDataDeInauguracao(Date dataDeInauguracao) {
        this.dataDeInauguracao = dataDeInauguracao;
    }    
}
