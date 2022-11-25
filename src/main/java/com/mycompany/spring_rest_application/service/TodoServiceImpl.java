package com.mycompany.spring_rest_application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.spring_rest_application.dao.TodoDao;
import com.mycompany.spring_rest_application.entity.Task;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	TodoDao todoDao;

	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return todoDao.getAllTasks();
	}
	
}
