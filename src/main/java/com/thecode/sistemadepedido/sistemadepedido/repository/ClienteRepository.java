package com.thecode.sistemadepedido.sistemadepedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thecode.sistemadepedido.sistemadepedido.model.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
