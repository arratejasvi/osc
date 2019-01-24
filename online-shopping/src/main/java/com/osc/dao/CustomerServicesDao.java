package com.osc.dao;

import java.util.List;

import com.osc.models.CustLogin;
import com.osc.models.Customers;

public interface CustomerServicesDao {
	
	public int createCustomer(Customers customer);
     public boolean CustomerLoginVerify(CustLogin custLogin);
     public boolean updateCustomer(int custId,Customers customer); 
     
     public boolean deleteCustomer(int custId);
     
     public Customers getCustomer(int custId);
     
     public List<Customers> getAllCusrtomers();

}
