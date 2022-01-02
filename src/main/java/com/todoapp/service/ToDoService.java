package com.todoapp.service;

import java.sql.Timestamp;
import java.util.*;

import com.todoapp.model.Task;

public class ToDoService {

	List<Task> taskList;
	public ToDoService toDoService;

	public ToDoService() {
		taskList = new ArrayList<>();
		taskList.add(new Task(1, "Complete Springboot assignment", Timestamp.valueOf("2022-01-02 11:00:00"),
				Timestamp.valueOf("2022-01-02 12:00:00"), Timestamp.valueOf("2022-01-02 11:00:00"), "PENDING"));
	}

	public Task createTask(Task newTask) {
		taskList.add(newTask);
		return newTask;
	}

	public Task getTaskById(Integer id) {
		Task task = new Task();
		
		for(Task availableTask : taskList) {
			if(availableTask.getId() == id) {
				task = availableTask;
				break;
			}
		}
		return task;
	}

	public boolean updateTask(Task updatedTask) {
		for(Task availableTask : taskList) {
			if(availableTask.getId() == updatedTask.getId()) {
				availableTask = updatedTask;
				return true;
			}
		}
		return false;
	}

	public boolean deleteTaskById(Integer id) {
		if(toDoService.getTaskById(id) != null) {
			taskList.remove(toDoService.getTaskById(id));
			return true;
		}
		return false;
	}

}
