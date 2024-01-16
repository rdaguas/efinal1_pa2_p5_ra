package com.uce.edu.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);
	}

	@Override
	public List<Transferencia> lista(String cuentaOrigen, String cuentaDestino) {
		// TODO Auto-generated method stub
		TypedQuery<Transferencia> myQuery = this.entityManager.createQuery("SELECT t FROM Transferencia t WHERE t.origen=:variableOrigen AND t.destino=:variableDestino", Transferencia.class);
		myQuery.setParameter("variableOrigen", cuentaOrigen);
		myQuery.setParameter("variableDestino", cuentaDestino);
		return myQuery.getResultList();
	}

}
