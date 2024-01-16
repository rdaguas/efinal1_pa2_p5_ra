package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia transferencia);
	public List<Transferencia> lista(String cuentaOrigen, String cuentaDestino);
	//public List<Transferencia>litaFinal(Transferencia transferencia);
	

	
}
