package com.mycompany.spring_rest_application.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.spring_rest_application.dao.CustomerDao;
import com.mycompany.spring_rest_application.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}

	@Override
	@Transactional
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.saveCustomer(customer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(id);
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(id);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

}
