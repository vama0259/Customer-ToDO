package com.mycompany.spring_rest_application.service;

import java.util.List;

import com.mycompany.spring_rest_application.entity.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();

	public Customer saveCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);

	public Customer getCustomer(int id);
	
	public void deleteCustomer(int id);

}
