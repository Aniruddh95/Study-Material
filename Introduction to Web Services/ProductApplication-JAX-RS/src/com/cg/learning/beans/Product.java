package com.cg.learning.beans;

public class Product {
	private int prodId;
	private String prodName;
	private float prodPrice;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int prodId, String prodName, float prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}


	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public float getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}

}
