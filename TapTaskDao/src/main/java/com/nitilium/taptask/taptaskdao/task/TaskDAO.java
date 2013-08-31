package com.nitilium.taptask.taptaskdao.task;

import com.nitilium.taptask.taptaskcore.task.Task;

public interface TaskDAO {

	Task create(Task task);

	Task findTaskById(Task task);

}
