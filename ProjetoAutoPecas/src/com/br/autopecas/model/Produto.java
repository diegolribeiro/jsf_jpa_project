package com.br.autopecas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="PRODUTO")
@Entity
public class Produto {

	@Id
	@Column(name="CODIGO_EAN")
	private String codigoEan;
	@Column(name="DESCRICAO")
	private String descricao;
	@Column(name="UNIDADE_MEDIDA")
	private String unidadeMedida;
	@Column(name="FATOR_CONVERSAO")
	private String fatorConversao;
	
	@ManyToOne
	private Fornecedor fornecedor;

	public String getCodigoEan() {
		return codigoEan;
	}

	public void setCodigoEan(String codigoEan) {
		this.codigoEan = codigoEan;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getFatorConversao() {
		return fatorConversao;
	}

	public void setFatorConversao(String fatorConversao) {
		this.fatorConversao = fatorConversao;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
