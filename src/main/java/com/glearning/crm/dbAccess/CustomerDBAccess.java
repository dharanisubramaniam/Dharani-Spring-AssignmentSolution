package com.glearning.crm.dbAccess;

import java.util.List;

import com.glearning.crm.model.Customer;

public interface CustomerDBAccess {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
