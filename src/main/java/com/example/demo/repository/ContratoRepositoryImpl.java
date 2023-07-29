package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Contrato;
import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class ContratoRepositoryImpl implements ContratoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Contrato contrato) {
		this.entityManager.persist(contrato);
	}

	@Override
	public void actualizar(Contrato contrato) {
		this.entityManager.merge(contrato);
	}

	@Override
	public Contrato seleccionar(Integer id) {
		TypedQuery<Contrato> query = this.entityManager.createQuery("SELECT c FROM Contrato WHERE c.id = :datoId",
				Contrato.class);
		query.setParameter("datoId", id);
		return query.getSingleResult();
	}

}
