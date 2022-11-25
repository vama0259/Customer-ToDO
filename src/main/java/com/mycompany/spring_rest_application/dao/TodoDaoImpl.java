package com.mycompany.spring_rest_application.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.spring_rest_application.entity.Task;

@Repository
public class TodoDaoImpl implements TodoDao{
	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Task", Task.class);
		return query.getResultList();
	}

}
