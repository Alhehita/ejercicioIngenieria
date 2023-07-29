package com.example.demo.service;

import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoService {

	public void registrar(Empleado empleado);

	public void actualizar(Empleado empleado);

	public Empleado buscar(Integer id);
}
