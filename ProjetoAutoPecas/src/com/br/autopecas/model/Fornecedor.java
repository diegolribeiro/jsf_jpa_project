package com.br.autopecas.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.br.autopecas.enums.TipoEnderecoEnum;
import com.br.autopecas.enums.TipoFabricaEnum;

@Table(name = "FORNECEDOR")
@Entity
public class Fornecedor {

	@Id
	@Column(name = "ID_FORNECEDOR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "CNPJ")
	private String cnpj;

	@Column(name = "TELEFONE")
	private String telefone;

	@Column(name = "TIPO_FABRICA")
	@Enumerated(EnumType.ORDINAL)
	private TipoFabricaEnum tipoFabrica;

	@Column(name = "TIPO_ENDERECO")
	@Enumerated(EnumType.STRING)
	private TipoEnderecoEnum tipoEndereco = TipoEnderecoEnum.COMERCIAL;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataCadastro = Calendar.getInstance(); 

	public TipoFabricaEnum getTipoFabrica() {
		return tipoFabrica;
	}

	public void setTipoFabrica(TipoFabricaEnum tipoFabrica) {
		this.tipoFabrica = tipoFabrica;
	}

	public TipoEnderecoEnum getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEnderecoEnum tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
