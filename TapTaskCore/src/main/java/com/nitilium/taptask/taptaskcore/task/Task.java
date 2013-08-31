package com.nitilium.taptask.taptaskcore.task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries(value = {

		@NamedQuery(name = "getAllTask", query = "SELECT t FROM Task t")

})


@Entity
@Table(name = "task")
public class Task {

	@Id
	@Column(name = "taskId", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false)
	private String title;

	@Temporal(TemporalType.TIME)
	@Column(nullable = false)
	private Date creationDate;

	@Temporal(TemporalType.TIME)
	private Date taskDate;

	private String description;

	@Column(nullable = false)
	private boolean checked;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	public Task() {

	}

	public Task(final String title, final Date creationDate,
			final Date taskDate, final String description,
			final TaskLevelEnum taskLevel) {
		super();
		this.title = title;
		this.creationDate = creationDate;
		this.taskDate = taskDate;
		this.description = description;
		this.taskLevel = taskLevel;
	}

	/**
	 * Getter of the id
	 * 
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter of the id.
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(final long id) {
		this.id = id;
	}

	/**
	 * Getter of the title
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setter of the title.
	 * 
	 * @param title
	 *            the title to set
	 */
	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * Getter of the creationDate
	 * 
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Setter of the creationDate.
	 * 
	 * @param creationDate
	 *            the creationDate to set
	 */
	public void setCreationDate(final Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * Getter of the taskDate
	 * 
	 * @return the taskDate
	 */
	public Date getTaskDate() {
		return taskDate;
	}

	/**
	 * Setter of the taskDate.
	 * 
	 * @param taskDate
	 *            the taskDate to set
	 */
	public void setTaskDate(final Date taskDate) {
		this.taskDate = taskDate;
	}

	/**
	 * Getter of the description
	 * 
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter of the description.
	 * 
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * Getter of the checked
	 * 
	 * @return the checked
	 */
	public boolean isChecked() {
		return checked;
	}

	/**
	 * Setter of the checked.
	 * 
	 * @param checked
	 *            the checked to set
	 */
	public void setChecked(final boolean checked) {
		this.checked = checked;
	}

	 * 
	 * @return the taskLevel
	 * Setter of the taskLevel.
	 * 
}
