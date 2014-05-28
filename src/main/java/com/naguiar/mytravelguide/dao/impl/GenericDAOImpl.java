/**
 * 
 */
package com.naguiar.mytravelguide.dao.impl;

import javax.persistence.EntityManager;

import com.naguiar.mytravelguide.dao.GenericDAO;


/**
 * @author naty
 *
 */
public class GenericDAOImpl<T> implements GenericDAO<T> {

	private final EntityManager entityManager;
	private final Class<T> type;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public Class<T> getType() {
		return type;
	}

	public GenericDAOImpl(EntityManager entityManager, Class<T> type) {
		this.entityManager = entityManager;
		this.type = type;
	}

	@Override
	public T create(T t) {
		this.entityManager.persist(t);
		return t;
	}

	@Override
	public void delete(Object id) {
		this.entityManager.remove(this.entityManager.getReference(type, id));
	}

	@Override
	public T find(Object id) {
		return entityManager.getReference(type, id);
	}

	@Override
	public T update(T t) {
		return this.entityManager.merge(t);  
	}
}
