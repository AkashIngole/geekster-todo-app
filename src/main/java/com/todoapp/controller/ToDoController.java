package com.todoapp.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.bookmgmt.model.Book;
import com.todoapp.model.Task;
import com.todoapp.service.ToDoService;

@RestController
@RequestMapping("/todo")
public class ToDoController {

	@Autowired
	private ToDoService toDoService;
	
	@PostMapping(value = "/create",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Task> createTask(@RequestBody Task newTask) {
		Task task = toDoService.createTask(newTask);
		return new ResponseEntity<Task>(task, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/get/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Task> getTask(@PathVariable("id") Integer id) {
		Task task = new Task();
		task = toDoService.getTaskById(id);
		if(task != null) {
			return new ResponseEntity<Task>(task, HttpStatus.OK);
		} else {
			return new ResponseEntity<Task>(task, HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping(value = "/update",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Task> updateTask(@RequestBody Task updatedTask) {
		if(toDoService.updateTask(updatedTask)) {
			return new ResponseEntity<Task>(updatedTask, HttpStatus.OK);
		} else {
			return new ResponseEntity<Task>(updatedTask, HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping(value = "/delete/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<Task> deleteTask(@PathVariable("id") Integer id) {
		if(toDoService.deleteTaskById(id)) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
