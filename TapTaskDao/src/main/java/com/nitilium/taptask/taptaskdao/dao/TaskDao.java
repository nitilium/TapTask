package com.nitilium.taptask.taptaskdao.dao;

import com.nitilium.taptask.taptaskcore.task.Task;

public interface TaskDao {

	
	Task create(Task entity);
	
	void delete(Task entity);
	
	Task update(Task entity);
	
	Task searchById(long id);
	
}
