package com.restapi.consumers.access;

import java.util.List;
import com.restapi.consumers.model.Product;

public interface IProductService {
	
		List<Product> findAll();
		
}
