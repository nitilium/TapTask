package com.nitilium.taptask.taptaskcore.task;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaskTest {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction tx;

	@BeforeClass
	public static void initManager() {


		emf = Persistence.createEntityManagerFactory("TapTaskTestUnit");
		em = emf.createEntityManager();
	}

	@AfterClass
	public static void closeEntityManager() {
		em.close();
		emf.close();
	}

	@Before
	public void initTransaction() {
		tx = em.getTransaction();
	}

	@Test
	public void createTask() {

		final Task task = new Task();
		task.setTitle("Task sample");
		task.setDescription("A simple task for simple people.");

		tx.begin();
		em.persist(task);
		tx.commit();

		final List<Task> listTask = em.createNamedQuery("getAllTask")
				.getResultList();
		assertNotNull(listTask);

	}

}
