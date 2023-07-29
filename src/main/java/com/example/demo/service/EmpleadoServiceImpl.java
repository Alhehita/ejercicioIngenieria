package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public void registrar(Empleado empleado) {
		this.empleadoRepository.insertar(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.empleadoRepository.actualizar(empleado);
	}

	@Override
	public Empleado buscar(Integer id) {

		return this.empleadoRepository.seleccionar(id);
	}

}
