package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EmpleadoRepositoryImpl implements EmpleadoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Empleado empleado) {
		this.entityManager.persist(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.entityManager.merge(empleado);
	}

	@Override
	public Empleado seleccionar(Integer id) {
		TypedQuery<Empleado> query = this.entityManager.createQuery("SELECT e FROM Empleado WHERE e.id = :datoId",
				Empleado.class);
		query.setParameter("datoId", id);
		return query.getSingleResult();
	}

}
