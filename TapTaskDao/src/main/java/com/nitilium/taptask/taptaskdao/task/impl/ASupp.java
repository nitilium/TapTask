package com.nitilium.taptask.taptaskdao.task.impl;

import com.nitilium.taptask.taptaskcore.task.Task;
import com.nitilium.taptask.taptaskdao.task.TaskDAO;

public class ASupp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Task t = new Task();
		t.setId(1L);
		t.setTitle("oooo");

		TaskDAO dao = new TaskDAOImpl();
		dao.create(t);
	}
}
