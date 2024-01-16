package com.uce.ec.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
	@Column(name = "cuen_id")
	private Integer id;
	private LocalDateTime fechaTransferencia;
		
	@Column(name = "cuen_monto")
	private BigDecimal monto;
	
	@Column(name = "cuen_comision")
	private BigDecimal comision;
	
	@Column(name = "cuen_cuenta_origen")
	private CuentaBancaria cuentaOrigen;
	
	@Column(name = "cuen_cuenta_destino")
	private CuentaBancaria cuentaDestino;
	
		
	@ManyToOne
	@JoinColumn(name = "id_trasnferecia_cuenta_bancaria")
	private CuentaBancaria cuentaBancaria;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Propietario propietario; 

	//To String
	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", fechaTransferencia=" + fechaTransferencia + ", monto=" + monto
				+ ", comision=" + comision + ", cuentaOrigen=" + cuentaOrigen + ", cuentaDestino=" + cuentaDestino
				+ ", propietario=" + propietario + ", cuentaBancaria=" + cuentaBancaria + "]";
	}
	
	//GET Y SET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}
	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
	public CuentaBancaria getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public CuentaBancaria getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(CuentaBancaria cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getComision() {
		return comision;
	}
	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
}
