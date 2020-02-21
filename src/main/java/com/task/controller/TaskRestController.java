package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.Dao.TaskDao;
import com.task.Dao.TaskDaoImpl;
import com.task.model.Task;



@RestController
public class TaskRestController {
	@Autowired 
	TaskDaoImpl taskdao;
	
	@PostMapping(value = "/createTask")
	public ResponseEntity<?> createTask(@RequestBody Task task) {
		
		return null;
	}
     
	@PostMapping(value="{userId}/addTask/{taskId}")
	public ResponseEntity<?>  assignTask(@PathVariable ("taskId") int taskId,@PathVariable("userId") int userId) {
		return null;
		
	}
     @GetMapping("/viewTask/{taskId}")
     public ResponseEntity<?> viewTask(@PathVariable ("taskId") int taskId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@PutMapping("/updateTask/{taskId}")
	public ResponseEntity<?> updateTask(@PathVariable ("taskId") int taskId, @RequestBody Task task) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@DeleteMapping("/deleteTask/{id}")
	public ResponseEntity<?>deleteTask(int taskId) {
		// TODO Auto-generated method stub
		return null;
		
	}
	
	@GetMapping("/lislAllTask")
	public ResponseEntity<?> lislAllTask() {
		return null;
		// TODO Auto-generated method stub
		
	}

}
