package com.cg.learning.service;

import java.util.List;

import com.cg.learning.beans.Product;
import com.cg.learning.exception.ProductNotFoundException;

public interface IProductService {

	public List<Product> getAllProducts();
	public Product addProduct(Product product);
	public float getProductPrice(String pname) throws ProductNotFoundException;
}
