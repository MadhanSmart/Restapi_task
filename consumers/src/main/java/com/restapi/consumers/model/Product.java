package com.restapi.consumers.model;

public class Product {

	private int id;  
	private String productName;  
	private String batchno;  
	private double price;  
	private int quantity;  
	
	public Product() {
		
	}

	public Product(int id, String productName, String batchno, double price, int quantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.batchno = batchno;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBatchno() {
		return batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", batchno=" + batchno + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
}
