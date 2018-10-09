package com.cg.learning.dao;

import java.util.List;

import com.cg.learning.beans.Product;
import com.cg.learning.exception.ProductNotFoundException;
import com.cg.learning.staticdb.ProductDB;

public class ProductDAOImpl implements IProductDAO {
	static List<Product> productList = ProductDB.loadList();
	
	@Override
	public List<Product> getAllProducts() {
	return productList;
	}	
	@Override
	public float getProductPrice(String pname) throws ProductNotFoundException {
		
		for (Product product : productList) {
			if(product.getProdName().equalsIgnoreCase(pname)){
				System.out.println(" product price : "+ product.getProdPrice());
				return product.getProdPrice();
				}
		}
		throw new ProductNotFoundException("Product does not exist");
	}
	@Override
	public Product addProduct(Product product) {
		productList.add(product);
		return product;
	}



}
