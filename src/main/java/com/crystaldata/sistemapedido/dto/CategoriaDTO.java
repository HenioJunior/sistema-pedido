package com.crystaldata.sistemapedido.dto;

import java.io.Serializable;

import com.crystaldata.sistemapedido.entities.Categoria;

public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	
	public CategoriaDTO() {
	}

	public CategoriaDTO(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public CategoriaDTO(Categoria entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}