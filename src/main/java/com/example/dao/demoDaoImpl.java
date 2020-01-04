package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vo.Customer;

@Repository
public class demoDaoImpl implements demoDao {

	protected static final String NAMESPACE = "com.example.demo.api.";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertCustomer(Customer customer) {
		return sqlSession.insert(NAMESPACE+"insertCustomer",customer);
	}

	@Override
	public int updateCustoemr(Customer customer) {
		return sqlSession.update(NAMESPACE+"updateCustomer",customer);
	}

	@Override
	public int deleteCustomer(Customer customer) {
		return sqlSession.delete(NAMESPACE+"deleteCustomer",customer);
	}

	@Override
	public List<Customer> CustomerList(Customer customer) {
		return sqlSession.selectList(NAMESPACE+"CustomerList",customer);
	}

}
