package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Contrato;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.ContratoService;
import com.example.demo.service.EmpleadoService;

@SpringBootApplication
public class ZoologicoISApplication implements CommandLineRunner{
	@Autowired
	private ContratoService contratoService;
	
	@Autowired
	private EmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(ZoologicoISApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Contrato contrato = new Contrato();
		
		Empleado empleado = new Empleado();
		
		empleado.setNombre("Marjorie");
		empleado.setCedula("Andrade");
		empleado.setEmail("mpam@hotmail.com");
		empleado.setCargo("Gerente");
		empleado.setFechaNacimiento(LocalDate.of(1995, 04, 24));
		empleado.setTelefono("0934927864");
		
		contrato.setCodigo("6754");
		contrato.setEmpleado(empleado);
		contrato.setFechaIngreso(LocalDate.of(2021, 8, 23));
		contrato.setFechaVencimiento(LocalDate.of(2025, 9, 10));
		empleado.setContrato(contrato);
		
		empleadoService.registrar(empleado);
	}

}
