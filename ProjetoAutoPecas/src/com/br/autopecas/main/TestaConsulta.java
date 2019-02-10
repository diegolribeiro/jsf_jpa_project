package com.br.autopecas.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.br.autopecas.model.Produto;
import com.br.autopecas.util.JPAUtil;

public class TestaConsulta {

	public static void main(String[] args) {
		EntityManager entityManager = new JPAUtil().getEntityManager();
		entityManager.getTransaction().begin();
		
		String jpql = "select p from Produto p";
		Query query = entityManager.createQuery(jpql);
		
		@SuppressWarnings("unchecked")
		List<Produto> resultList = query.getResultList();
		
		for (Produto produto : resultList) {
			System.out.println(produto.getCodigoEan());
		}		
	
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
