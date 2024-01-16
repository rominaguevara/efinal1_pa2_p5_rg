package com.uce.ec.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.ec.repository.modelo.CuentaBancaria;
import com.uce.ec.repository.modelo.Transferencia;

public interface ITransferenciaService {

	public void realizarTransferecnia(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, BigDecimal monto);
	
	public List<Transferencia> todasTransferencias(LocalDateTime fechaHoy);
}
