package com.bing.product.repository;

import java.util.List;

import com.bing.product.dto.ProductDto;



public interface ProductRepository {
	
boolean save(ProductDto dto);
	
	List<ProductDto> getAll();
	
	boolean updateById(int productId,ProductDto dto);
    
	boolean deleteById(int productId, ProductDto dto);

}
