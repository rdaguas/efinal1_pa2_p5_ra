package com.uce.edu.service;

import java.math.BigDecimal;
import java.util.List;

import com.uce.edu.repository.modelo.Transferencia;

public interface ITransferenciaService {

	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal montoTransferencia);
	public List<Transferencia> lista(String cuentaOrigen, String cuentaDestino);
}
