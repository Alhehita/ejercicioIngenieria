package com.example.demo.repository.modelo;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
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
public class Empleado {

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

	@Column(name = "empl_cargo")
	private String cargo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Contrato contrato;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", fechaNacimiento="
				+ fechaNacimiento + ", email=" + email + ", telefono=" + telefono + ", cargo=" + cargo + "]";
	}
	
	

}
