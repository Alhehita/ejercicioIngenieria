package com.example.demo.repository;

import com.example.demo.repository.modelo.Contrato;

public interface ContratoRepository {

	public void insertar(Contrato contrato);

	public void actualizar(Contrato contrato);

	public Contrato seleccionar(Integer id);
}
