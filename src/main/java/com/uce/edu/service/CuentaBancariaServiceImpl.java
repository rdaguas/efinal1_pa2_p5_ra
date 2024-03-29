package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICuentaBancariaRepository;
import com.uce.edu.repository.modelo.CuentaBancaria;
@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;
	
	@Override
	public void guardar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.insertar(cuentaBancaria);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.iCuentaBancariaRepository.seleccionar(numero);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.actualizar(cuentaBancaria);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.eliminar(numero);
	}

}
