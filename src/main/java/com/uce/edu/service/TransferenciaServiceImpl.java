package com.uce.edu.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICuentaBancariaRepository;
import com.uce.edu.repository.ITransferenciaRepository;
import com.uce.edu.repository.modelo.Transferencia;
@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	
	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;
	
	@Override
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal montoTransferencia) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Transferencia> lista(String cuentaOrigen, String cuentaDestino) {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.lista(cuentaOrigen, cuentaDestino);
	}

}
