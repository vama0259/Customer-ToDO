package com.mycompany.spring_rest_application.dao;

import java.util.List;

import com.mycompany.spring_rest_application.entity.Customer;

public interface CustomerDao {

	public List<Customer> getAllCustomers();

	public Customer saveCustomer(Customer customer);

	public Customer getCustomer(int id);
	
	public void deleteCustomer(int id);

	public Customer updateCustomer(Customer customer);

}
