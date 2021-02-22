package com.crystaldata.sistemapedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crystaldata.sistemapedido.entities.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
