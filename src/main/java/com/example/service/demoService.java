package com.example.service;

import java.util.List;

import com.example.vo.Customer;

public interface demoService {

	public int insertCustomer(Customer customer);
	
	public int updateCustoemr(Customer customer);
	
	public int deleteCustomer(Customer customer);
	
	public List<Customer> CustomerList(Customer customer);
}
