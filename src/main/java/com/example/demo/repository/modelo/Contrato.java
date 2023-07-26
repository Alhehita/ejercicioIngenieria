package com.example.demo.repository.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "contrato")
public class Contrato {
	
	@GeneratedValue(generator = "seq_contrato", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_contrato", sequenceName = "seq_contrato", allocationSize = 1)
	@Id
	@Column(name = "crto_id")
	private Integer id;
	
	@Column(name = "crto_codigo")
	private String codigo;
	
	@Column(name = "crto_fecha_ingreso")
	private LocalDate fechaIngreso;
	
	@Column(name = "crto_fecha_vencimiento")
	private LocalDate fechaVencimiento;
	
	//private Empleado<T> empleado;

}
