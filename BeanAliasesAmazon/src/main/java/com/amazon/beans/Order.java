package com.amazon.beans;

public class Order {
	private int prodId;
	private String prodName;
	private double price;

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
	}

}
