package com.example.demo.service;

import com.example.demo.repository.modelo.Contrato;

public interface ContratoService {

	public void registrar(Contrato contrato);

	public void actualizar(Contrato contrato);

	public Contrato buscar(Integer id);
}
