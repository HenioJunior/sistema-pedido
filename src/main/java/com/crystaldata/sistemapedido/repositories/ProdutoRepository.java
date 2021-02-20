package com.crystaldata.sistemapedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crystaldata.sistemapedido.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
