package com.crystaldata.sistemapedido.entities;

import java.util.Date;

import javax.persistence.Entity;

import com.crystaldata.sistemapedido.entities.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Date DataVencimento;
	private Date DataPagamento;
	
	public PagamentoComBoleto() {}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento,
			Date dataPagamento) {
		super(id, estado, pedido);
		DataVencimento = dataVencimento;
		DataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return DataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		DataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return DataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		DataPagamento = dataPagamento;
	}
}
