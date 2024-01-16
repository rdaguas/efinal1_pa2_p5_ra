package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "transferencia")
public class Transferencia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transferencia")
	@SequenceGenerator(name = "seq_transferencia", sequenceName = "seq_transferencia", allocationSize = 1)
	@Column(name = "tran_id")
	private Integer id;
	
	@Column(name = "tran_fecha_transferencia")
	private LocalDate fechaTransferencia;
	
	@Column(name = "tran_cuenta_origen")
	private String cuentaOrigen;
	
	@Column(name = "tran_cuenta_destino")
	private String cuentaDestino;
	
	@Column(name = "tran_monto_transferencia")
	private BigDecimal montoTransferencia;
	
	@Column(name = "tran_comision_transferencia")
	private BigDecimal comisionTransferencia;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tran_id_propietario")
	private Propietario propietario;
	
	@ManyToOne
	@JoinColumn(name = "tran_id_cuentaBancaria")
	private CuentaBancaria cuentaBancaria;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFechaTransferencia() {
		return fechaTransferencia;
	}

	public void setFechaTransferencia(LocalDate fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}

	public String getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public BigDecimal getMontoTransferencia() {
		return montoTransferencia;
	}

	public void setMontoTransferencia(BigDecimal montoTransferencia) {
		this.montoTransferencia = montoTransferencia;
	}

	public BigDecimal getComisionTransferencia() {
		return comisionTransferencia;
	}

	public void setComisionTransferencia(BigDecimal comisionTransferencia) {
		this.comisionTransferencia = comisionTransferencia;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	
}
