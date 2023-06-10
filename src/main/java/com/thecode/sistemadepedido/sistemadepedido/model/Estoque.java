package com.thecode.sistemadepedido.sistemadepedido.model;

public class Estoque {
    public Long id;
    public String produto;
    public String descricao;
    //getters and setters
    public Long getId() {
        return id;
    }
    //sem setId
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    //to string
    @Override
    public String toString() {
        return "Estoque [id=" + id + ", produto=" + produto + ", descricao=" + descricao + "]";
    }

    
}
