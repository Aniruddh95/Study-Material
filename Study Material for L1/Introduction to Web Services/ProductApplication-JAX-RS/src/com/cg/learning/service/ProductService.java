package com.cg.learning.service;

import java.util.List;

import com.cg.learning.beans.Product;
import com.cg.learning.dao.IProductDAO;
import com.cg.learning.dao.ProductDAOImpl;
import com.cg.learning.exception.ProductNotFoundException;

public class ProductService implements IProductService{
IProductDAO dao= new ProductDAOImpl();
	@Override
	public List<Product> getAllProducts() {
		try {
			return dao.getAllProducts();
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
	}
	@Override
	public Product addProduct(Product product) {
		try {
			return dao.addProduct(product);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
	@Override
	public float getProductPrice(String pname) throws ProductNotFoundException {
		return dao.getProductPrice(pname);
	}

}
