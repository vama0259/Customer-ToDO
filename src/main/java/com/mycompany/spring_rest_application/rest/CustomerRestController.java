package com.mycompany.spring_rest_application.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.spring_rest_application.entity.Customer;
import com.mycompany.spring_rest_application.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	@Autowired
	private CustomerService customerService;
	@GetMapping("/customers")
	public List<Customer> getCustomerList() {
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
	
	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customer;
	}
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
		return customer;
	}
	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}
}
