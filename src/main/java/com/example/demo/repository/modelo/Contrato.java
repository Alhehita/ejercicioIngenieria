package com.example.demo.repository.modelo;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name = "crto_id_empleado")
	private Empleado empleado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Contrato [id=" + id + ", codigo=" + codigo + ", fechaIngreso=" + fechaIngreso + ", fechaVencimiento="
				+ fechaVencimiento + "]";
	}
	
	

}
