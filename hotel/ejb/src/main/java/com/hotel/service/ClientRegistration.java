package com.hotel.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.hotel.model.Cliente;

@Stateless
@LocalBean
@Named
public class ClientRegistration {
	@PersistenceContext
	private EntityManager em;
	
	public List<Cliente> todosOsClientes(){
		Query query = em.createNativeQuery("Select * from cliente", Cliente.class);
		List<Cliente> resultado = query.getResultList();		
		return resultado;
		
	}

}
