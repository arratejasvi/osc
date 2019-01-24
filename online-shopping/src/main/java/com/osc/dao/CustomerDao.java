package com.osc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.osc.databaseconnection.DBConnection;
import com.osc.models.CustLogin;
import com.osc.models.Customers;

public class CustomerDao implements CustomerServicesDao {

	@Override
	public int createCustomer(Customers customer) {
		
		Connection con=null;
		PreparedStatement ps =null;
		int res=0;
		
		try
		{
			con = DBConnection.geConnection();
			
			ps= con.prepareStatement("insert into Customers values(?,?,?,?,?)");
			
			ps.setString(1, customer.getC_id());
			ps.setString(2, customer.getC_password());
			ps.setString(3, customer.getC_email());
			ps.setString(4, customer.getC_mobile());
			ps.setString(5, customer.getC_status());
			
			res=ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
  finally
  {
	  try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

		


		return res;
	}

	@Override
	public boolean CustomerLoginVerify(CustLogin custLogin) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps =null;
		boolean res=false;
		
		try
		{
			con = DBConnection.geConnection();
			
			ps= con.prepareStatement("select  * from Customers  where c_id=? and c_password=?");
			
			ps.setString(1, custLogin.getUsername());
			ps.setString(2, custLogin.getPassword());
	
			
			ResultSet resultset = ps.executeQuery();
			if(resultset.next())
			{
				res=true;
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
  finally
  {
	  try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

		



		return false;
	}

	@Override
	public boolean updateCustomer(int custId, Customers customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int custId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customers getCustomer(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customers> getAllCusrtomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
