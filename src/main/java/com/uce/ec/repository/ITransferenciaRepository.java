package com.uce.ec.repository;

import com.uce.ec.repository.modelo.Transferencia;

public interface ITransferenciaRepository {

	//CRUD
		public void insertar(Transferencia transferencia);
		
		public Transferencia seleccionar(Integer id);
}
