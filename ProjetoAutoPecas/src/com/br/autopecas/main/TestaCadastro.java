package com.br.autopecas.main;

import java.util.List;

import com.br.autopecas.dao.DAO;
import com.br.autopecas.enums.TipoEnderecoEnum;
import com.br.autopecas.enums.TipoFabricaEnum;
import com.br.autopecas.model.Fornecedor;

public class TestaCadastro {
	public static void main(String[] args) {
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setCnpj("12312312");
		fornecedor.setDescricao("Fornecedor A");
		fornecedor.setTelefone("12312321");
		fornecedor.setTipoEndereco(TipoEnderecoEnum.COMERCIAL);
		fornecedor.setTipoFabrica(TipoFabricaEnum.MATRIZ);
		DAO<Fornecedor> dao = new DAO<Fornecedor>(Fornecedor.class);
		dao.adiciona(fornecedor);
		
		List<Fornecedor> listaTodos = dao.listaTodos();
		for (Fornecedor fornecedor2 : listaTodos) {
			System.out.println(fornecedor2.getCnpj());
		}
	}
}
