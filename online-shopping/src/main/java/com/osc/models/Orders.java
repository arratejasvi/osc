package com.osc.models;

public class Orders {
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int order_id;
	private Items item_id;
	private Customers c_id;
	
	
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Items getItem_id() {
		return item_id;
	}
	public void setItem_id(Items item_id) {
		this.item_id = item_id;
	}
	public Customers getC_id() {
		return c_id;
	}
	public void setC_id(Customers c_id) {
		this.c_id = c_id;
	}
}

