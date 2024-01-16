package com.uce.edu.service;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void guardar(CuentaBancaria cuentaBancaria);
	public CuentaBancaria buscar(String numero);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void eliminar(String numero);
}
