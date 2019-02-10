package com.br.autopecas.bean;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.br.autopecas.model.Produto;

@ManagedBean
@ViewScoped
public class ProdutoBean {
	private Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
