package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(propietario);
	}

	@Override
	public Propietario seleccionar(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Propietario> myQuery = this.entityManager.createQuery("SELECT p FROM Propietario p WHERE p.cedula=:variable", Propietario.class);
		myQuery.setParameter("variable", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		Propietario prop = this.seleccionar(cedula);
		this.entityManager.remove(prop);
	}

}
