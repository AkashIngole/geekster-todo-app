package com.todoapp.model;

import java.sql.Timestamp;

public class Task {
	
	private Integer id;
	private String description;
	private Timestamp startTime;
	private Timestamp endTime;
	private Timestamp modifiedTime;
	private String status;
	
	public Task () {}

	public Task(Integer id, String description, Timestamp startTime, Timestamp endTime, Timestamp modifiedTime,
			String status) {
		this.id = id;
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
		this.modifiedTime = modifiedTime;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}
	
	
}
