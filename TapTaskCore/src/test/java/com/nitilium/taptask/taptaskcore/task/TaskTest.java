package com.nitilium.taptask.taptaskcore.task;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TaskTest {

	private EntityManager em;
	private EntityTransaction transaction;

	@Before
	public void setUp() {
		final EntityManagerFactory fact = Persistence
				.createEntityManagerFactory("TestPU");
		em = fact.createEntityManager();
		transaction = em.getTransaction();
	}

	@After
	public void tearDown() {
		em.close();
	}

	@Test
	public void testPersistTask() {

		final Task task = new Task("First todo task", new Date(), new Date(),
				"description", TaskLevelEnum.MEDIUM);

		transaction.begin();

		em.persist(task);
		transaction.commit();
		
		assertTrue(task.getId()!=0);
	}

}
