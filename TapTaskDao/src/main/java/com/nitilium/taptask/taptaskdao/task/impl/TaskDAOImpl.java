package com.nitilium.taptask.taptaskdao.task.impl;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.nitilium.taptask.taptaskcore.task.Task;
import com.nitilium.taptask.taptaskdao.task.TaskDAO;

public class TaskDAOImpl implements TaskDAO {

	private EntityManager em;

	@Override
	public Task create(Task task) {
		em = Persistence.createEntityManagerFactory("productionUnit")
				.createEntityManager();

		em.getTransaction().begin();

		em.persist(task);

		em.getTransaction().commit();

		return task;
	}

	@Override
	public Task findTaskById(Task task) {
		// TODO Auto-generated method stub
		return null;
	}

}
