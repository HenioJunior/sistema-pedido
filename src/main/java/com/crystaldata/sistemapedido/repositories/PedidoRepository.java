package com.crystaldata.sistemapedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crystaldata.sistemapedido.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
