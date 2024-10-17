package com.bing.product.service;

import java.util.List;

import com.bing.product.dto.ProductDto;



public interface ProductService {
	
    String validate(ProductDto dto);
	
	List<ProductDto> getAll();
	
	String updateById(int productId,ProductDto dto);
	
	String deleteById(int productId, ProductDto dto);

}
