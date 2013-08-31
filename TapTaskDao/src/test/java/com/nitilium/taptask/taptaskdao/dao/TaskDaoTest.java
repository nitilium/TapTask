package com.nitilium.taptask.taptaskdao.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nitilium.taptask.taptaskcore.task.Task;
import com.nitilium.taptask.taptaskcore.task.TaskLevelEnum;
import com.nitilium.taptask.taptaskdao.dao.impl.TaskDaoImpl;

public class TaskDaoTest {

	private TaskDao taskDao;

	private EntityManager em;

	@Before
	public void setUp() {

		final EntityManagerFactory fact = Persistence
				.createEntityManagerFactory("TestPU");
		em = fact.createEntityManager();

		taskDao = new TaskDaoImpl(em);
	}

	@After
	public void setDown() {
		em.close();
	}

	@Test
	public void testCRUD() {

		Task task = new Task("petit test", new Date(), new Date(),
				"Short description", TaskLevelEnum.HIGH);

		task = taskDao.create(task);

		Assert.assertFalse(task.getId() == 0);

		Task taskPull = taskDao.searchById(task.getId());

		Assert.assertNotNull(taskPull);
		Assert.assertEquals(task.getId(), taskPull.getId());

		taskPull.setDescription("second");
		taskDao.update(taskPull);

		Assert.assertEquals(task.getId(), taskPull.getId());

		taskDao.delete(taskPull);
		taskPull = taskDao.searchById(task.getId());

		Assert.assertNull(taskPull);

	}

}
