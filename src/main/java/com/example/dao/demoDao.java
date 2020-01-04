package com.example.dao;

import java.util.List;

import com.example.vo.Customer;

public interface demoDao {
	
	public int insertCustomer(Customer customer);
	
	public int updateCustoemr(Customer customer);
	
	public int deleteCustomer(Customer customer);
	
	public List<Customer> CustomerList(Customer customer);
}
