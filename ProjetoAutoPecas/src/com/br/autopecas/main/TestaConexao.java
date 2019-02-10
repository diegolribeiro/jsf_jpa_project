package com.br.autopecas.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.br.autopecas.model.Fornecedor;
import com.br.autopecas.util.JPAUtil;

public class TestaConexao {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setCnpj("12312312");
		fornecedor.setDescricao("Fornecedor A");
		fornecedor.setTelefone("12312321");
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(fornecedor);	
		
		String jpql = "select p from Produto p";
		Query query = em.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<Fornecedor> resultList = query.getResultList();
		
		for (Fornecedor fornecedor1 : resultList) {
			System.out.println(fornecedor1.getDescricao());
		}		
		
		em.getTransaction().commit();
		em.close();
	}
}
