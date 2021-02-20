package com.crystaldata.sistemapedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crystaldata.sistemapedido.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
