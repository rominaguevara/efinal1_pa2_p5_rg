package com.uce.ec.repository;

import com.uce.ec.repository.modelo.Propietario;

public interface IPropietarioRepository {
	//CRUD
	public Propietario seleccionar(Integer id);

	public void insertar(Propietario propietario);

	public void actualizar(Propietario propietario);

	public void eliminar(Integer id);
	
}
