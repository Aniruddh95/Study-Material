package com.cg.learning.controller;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cg.learning.beans.Product;
import com.cg.learning.exception.ProductNotFoundException;
import com.cg.learning.service.IProductService;
import com.cg.learning.service.ProductService;
@Path("/products")
public class ProductController {
	IProductService service= new ProductService();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Product addProduct(@FormParam("txtProductId") int txtId,
			@FormParam("txtProductName") String txtName,
			@FormParam("txtPrice") float  txtPrice) {
		Product product = new Product();
		product.setProdId(txtId);
		product.setProdName(txtName);
		product.setProdPrice(txtPrice);
		return service.addProduct(product);
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProductList() {
		List<Product> listOfProducts = service.getAllProducts();
		return listOfProducts;
	}
}






