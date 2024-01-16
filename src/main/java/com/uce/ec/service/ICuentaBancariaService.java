package com.uce.ec.service;

import com.uce.ec.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	// CRUD
	public CuentaBancaria buscar(Integer id);

	public void guardar(CuentaBancaria cuentaBancaria);

	public void actualizar(CuentaBancaria cuentaBancaria);

	public void eliminar(Integer id);
}
