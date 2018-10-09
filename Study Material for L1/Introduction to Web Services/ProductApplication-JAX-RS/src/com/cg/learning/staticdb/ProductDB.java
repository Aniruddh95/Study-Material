package com.cg.learning.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.learning.beans.Product;

public class ProductDB {
	
	static List<Product> productList = loadList();
	
	public static List<Product> loadList() {
		return productList;
	}
	
	static {
		if(productList==null) {
			productList = new ArrayList<Product>();
			productList.add(new Product(101,"Laptop",45678.34f));
			productList.add(new Product(102,"IPad",65678.84f));
			productList.add(new Product(103,"IPhone",84678.34f));
			productList.add(new Product(104,"IPod",1200.99f));
			productList.add(new Product(105,"Hard Disk",5000.00f));
			productList.add(new Product(106,"Data Cables",2000.15f));
			productList.add(new Product(107,"Fit Bit Wrist Band",5000.78f));
			productList.add(new Product(108,"Arm Sleeves",500.12f));
			productList.add(new Product(109,"Adapter",4000.26f));
			productList.add(new Product(110,"Samsung Tab",75678.00f));
		}
	}
}
