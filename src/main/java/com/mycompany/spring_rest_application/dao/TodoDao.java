package com.mycompany.spring_rest_application.dao;

import java.util.List;

import com.mycompany.spring_rest_application.entity.Task;

public interface TodoDao {
	
	public List<Task> getAllTasks();

}
