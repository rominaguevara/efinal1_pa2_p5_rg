package com.uce.ec.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.repository.ITransferenciaRepository;
import com.uce.ec.repository.modelo.CuentaBancaria;
import com.uce.ec.repository.modelo.Transferencia;


@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	
	
	
	@Override
	public List<Transferencia> todasTransferencias(LocalDateTime fechaHoy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void realizarTransferecnia(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		//1.-Crear Transferencia
		Transferencia transferencia = new Transferencia();
		//2.-Setear transferencia
		transferencia.setCuentaOrigen(cuentaOrigen);
		transferencia.setCuentaDestino(cuentaDestino);
		transferencia.setFechaTransferencia(LocalDateTime.now());
		transferencia.setMonto(monto);
		
	}

}
