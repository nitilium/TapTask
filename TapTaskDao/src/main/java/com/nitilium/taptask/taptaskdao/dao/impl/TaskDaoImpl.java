package com.nitilium.taptask.taptaskdao.dao.impl;

import javax.persistence.EntityManager;

import com.nitilium.taptask.taptaskcore.task.Task;
import com.nitilium.taptask.taptaskdao.dao.TaskDao;

public class TaskDaoImpl implements TaskDao {

	private EntityManager entityManager;

	public TaskDaoImpl(final EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	/**
	 * Setter of the entityManager.
	 * 
	 * @param entityManager
	 *            the entityManager to set
	 */
	public void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Task create(final Task entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public void delete(final Task entity) {
		entityManager.remove(entity);
	}

	@Override
	public Task update(final Task entity) {

		return entityManager.merge(entity);
	}

	@Override
	public Task searchById(final long id) {
		return entityManager.find(Task.class, id);
	}

}
