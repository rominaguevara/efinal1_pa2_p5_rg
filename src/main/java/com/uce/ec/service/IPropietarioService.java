package com.uce.ec.service;

import com.uce.ec.repository.modelo.Propietario;

public interface IPropietarioService {

	//CRUD
		public Propietario buscar(Integer id);

		public void guardar(Propietario propietario);

		public void actualizar(Propietario propietario);

		public void eliminar(Integer id);
	
}
