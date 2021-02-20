package com.crystaldata.sistemapedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crystaldata.sistemapedido.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
