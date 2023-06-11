package com.thecode.sistemadepedido.sistemadepedido.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false)
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
    public void toCliente(){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }
    //to string
    @Override
    public String toString() {
        return "Clientes [id=" + id + ", nome=" + nome + ", telefone=" + telefone + "]";
    }
    
    
}
