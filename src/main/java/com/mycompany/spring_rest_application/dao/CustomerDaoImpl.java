package com.mycompany.spring_rest_application.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.spring_rest_application.entity.Customer;
import com.mycompany.spring_rest_application.rest.CustomerNotFoundException;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Customer", Customer.class);
		return query.getResultList();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		customer.setId(0);  	//to prevent custom id form the user
		session.getTransaction().begin();
		session.save(customer);
		session.getTransaction().commit();
		return customer;
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		if(customer == null) {
			throw new CustomerNotFoundException("Customer is not found with id " + id);
		}
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Customer customer = session.get(Customer.class, id);
		if(customer == null) {
			throw new CustomerNotFoundException("Customer is not found with id " + id);
		}
		session.getTransaction().begin();
		session.delete(customer);
		session.getTransaction().commit();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Customer tempCustomer = session.get(Customer.class, customer.getId());
		if(tempCustomer == null) {
			throw new CustomerNotFoundException("Customer is not found with id " + customer.getId());
		}
		else {
			session.getTransaction().begin();
			session.merge(customer);
			session.getTransaction().commit();
		}
		return customer;
	}
}
