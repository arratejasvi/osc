package com.osc.models;

import java.sql.Date;

public class OrderDetails {
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String price;
	private Date dateoforder;
	private String status;
	private Orders order_id;
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Date getDateoforder() {
		return dateoforder;
	}
	public void setDateoforder(Date dateoforder) {
		this.dateoforder = dateoforder;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Orders getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Orders order_id) {
		this.order_id = order_id;
	}

}

