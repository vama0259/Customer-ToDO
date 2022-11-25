package com.mycompany.spring_rest_application.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.spring_rest_application.entity.Task;
import com.mycompany.spring_rest_application.service.TodoService;

@RestController
@RequestMapping("/api")
public class ToDoRestController {
	@Autowired
	private TodoService todoService;
	@GetMapping("/todo")
	public List<Task> listToDo() {
		return todoService.getAllTasks();
	}
}
