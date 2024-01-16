package com.uce.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.repository.ICuentaBancariaRepository;
import com.uce.ec.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepository iBancariaRepository;
	
	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iBancariaRepository.seleccionar(id);
	}

	@Override
	public void guardar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.iBancariaRepository.insertar(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.iBancariaRepository.actualizar(cuentaBancaria);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iBancariaRepository.eliminar(id);
	}

}
