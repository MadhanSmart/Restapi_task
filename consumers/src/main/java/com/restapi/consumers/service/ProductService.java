package com.restapi.consumers.service;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import com.restapi.consumers.access.IProductService;
import com.restapi.consumers.model.Product;

@Service
public class ProductService implements IProductService{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product> products = new ArrayList<Product>(); 
		
		products.add(new Product(1010, "Chocolate", "64867", 10.00, 20));  
		products.add(new Product(1011, "ButterMilk", "64868", 6.00, 12));  
		products.add(new Product(1012, "Dhaal", "64869", 90.00, 7));  
		products.add(new Product(1013, "Dates", "658954", 150.00, 25));  
		products.add(new Product(1014, "Almonds", "658952", 300.00, 5));  
		products.add(new Product(1015, "Soap", "89523", 12.00, 4));  
		
		return products;
	}

}
