package com.cg.learning.dao;

import java.util.List;

import com.cg.learning.beans.Product;
import com.cg.learning.exception.ProductNotFoundException;

public interface IProductDAO {
	public List<Product> getAllProducts() throws ProductNotFoundException;
	public Product addProduct(Product product) throws ProductNotFoundException;
	public float getProductPrice(String pname) throws ProductNotFoundException;
}
