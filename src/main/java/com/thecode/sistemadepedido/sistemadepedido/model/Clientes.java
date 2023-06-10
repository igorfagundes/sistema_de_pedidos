package com.thecode.sistemadepedido.sistemadepedido.model;

public class Clientes {
    public Long id;
    public String nome;
    public String telefone;
    //getters and setters
    public Long getId() {
        return id;
    }
    //sem setId
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //to string
    @Override
    public String toString() {
        return "Clientes [id=" + id + ", nome=" + nome + ", telefone=" + telefone + "]";
    }
    
    
}
