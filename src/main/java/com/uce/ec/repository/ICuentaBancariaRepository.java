package com.uce.ec.repository;

import com.uce.ec.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	// CRUD
	public CuentaBancaria seleccionar(Integer id);

	public void insertar(CuentaBancaria cuentaBancaria);

	public void actualizar(CuentaBancaria cuentaBancaria);

	public void eliminar(Integer id);
}
