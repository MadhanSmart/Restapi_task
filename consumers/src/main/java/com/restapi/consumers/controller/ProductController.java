package com.restapi.consumers.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restapi.consumers.access.IProductService;
import com.restapi.consumers.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;

	@GetMapping(value = "/product")
	public List<Product> getProduct() {

		List<Product> products = productService.findAll();

		return products;
		
	}
	
}
