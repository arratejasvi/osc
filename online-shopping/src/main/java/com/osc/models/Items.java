package com.osc.models;

public class Items {
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int item_id;
	private Merchants merchant;
	private int price;
	private int quantity;
	
	
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	
	public Merchants getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchants merchant) {
		this.merchant = merchant;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
