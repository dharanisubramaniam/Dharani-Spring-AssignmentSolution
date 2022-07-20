package com.glearning.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glearning.crm.dbAccess.CustomerDBAccess;
import com.glearning.crm.model.Customer;

@Service
public class CustomerServiceImplementation implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerDBAccess customerDBAccess;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDBAccess.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		customerDBAccess.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		
		return customerDBAccess.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		
		customerDBAccess.deleteCustomer(theId);
	}
}
