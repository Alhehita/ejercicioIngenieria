package com.example.demo.repository.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado<T> {

	@GeneratedValue(generator = "seq_empleado", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_empleado", sequenceName = "seq_empleado", allocationSize = 1)
	@Id
	@Column(name = "empl_id")
	private Integer id;

	@Column(name = "empl_nombre")
	private String nombre;

	@Column(name = "empl_cedula")
	private String cedula;

	@Column(name = "empl_fecha_nacimiento")
	private LocalDate fechaNacimiento;

	@Column(name = "empl_email")
	private String email;

	@Column(name = "empl_telefono")
	private String telefono;

	@OneToOne
	private Contrato contrato;

}
