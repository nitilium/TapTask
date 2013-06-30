package com.nitilium.taptask.taptaskcore.task;

import java.util.Date;

public class Task {

	private long id;

	private String title;

	private Date creationDate;

	private Date taskDate;

	private String description;

	private boolean checked;

	private TaskLevelEnum taskLevel;

	/**
	 * @return the id of the task.
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the title of the task.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the creationDate date of creationb of the task.
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate
	 *            the creationDate to set.
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the taskDate when the task will be done.
	 */
	public Date getTaskDate() {
		return taskDate;
	}

	/**
	 * @param taskDate
	 *            the taskDate to set.
	 */
	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}

	/**
	 * @return the description of the task.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the checked true if the task is done.
	 */
	public boolean isChecked() {
		return checked;
	}

	/**
	 * @param checked
	 *            the checked to set.
	 */
	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	/**
	 * @return the taskLevel the level of the task.
	 */
	public TaskLevelEnum getTaskLevel() {
		return taskLevel;
	}

	/**
	 * @param taskLevel
	 *            the taskLevel to set.
	 */
	public void setTaskLevel(TaskLevelEnum taskLevel) {
		this.taskLevel = taskLevel;
	}

}
