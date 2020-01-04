package com.example.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.demoService;
import com.example.vo.Customer;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MainController {
	private static final Logger LOGGER = LogManager.getLogger(MainController.class);

	@Autowired
	private demoService service;
	
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> getAllCustomers(){
		Customer customer = new Customer();
		LOGGER.debug("customersList");
		return service.CustomerList(customer);
	}
	
	@RequestMapping(value="/customer", method = RequestMethod.POST)
	public int postCustomer(@RequestBody Customer customer) {
		LOGGER.debug("insertCustomer");
		return service.insertCustomer(customer);
	}
	
	@RequestMapping(value="/customer/{id}", method = RequestMethod.DELETE)
	public int deleteCustomer(@PathVariable("id") long id) {
		LOGGER.debug("deleteCustomer");
		Customer customer = new Customer();
		customer.setId(id);
		return service.deleteCustomer(customer);
	}
	
	@RequestMapping(value="/customers/age/{age}")
	public List<Customer> findByAge(@PathVariable int age) {
		LOGGER.debug("findCustomer");
		Customer customer = new Customer();
		customer.setAge(age);
		return service.CustomerList(customer);
	}
	@RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
	public int updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
		LOGGER.debug("updateCustomer");

		return service.updateCustoemr(customer);
	}
}
