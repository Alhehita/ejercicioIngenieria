package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ContratoRepository;
import com.example.demo.repository.modelo.Contrato;

@Service
public class ContratoServiceImpl implements ContratoService {

	@Autowired
	private ContratoRepository contratoRepository;

	@Override
	public void registrar(Contrato contrato) {
		this.contratoRepository.insertar(contrato);
	}

	@Override
	public void actualizar(Contrato contrato) {
		this.contratoRepository.actualizar(contrato);
	}

	@Override
	public Contrato buscar(Integer id) {
		return this.contratoRepository.seleccionar(id);
	}

}
