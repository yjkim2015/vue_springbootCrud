package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.demoDao;
import com.example.vo.Customer;

@Service
public class demoServiceImpl implements demoService {

	@Autowired
	private demoDao dao;
	
	@Override
	public int insertCustomer(Customer customer) {
		return dao.insertCustomer(customer);
	}

	@Override
	public int updateCustoemr(Customer customer) {
		return dao.updateCustoemr(customer);
	}

	@Override
	public int deleteCustomer(Customer customer) {
		return dao.deleteCustomer(customer);
	}

	@Override
	public List<Customer> CustomerList(Customer customer) {
		return dao.CustomerList(customer);
	}

}
