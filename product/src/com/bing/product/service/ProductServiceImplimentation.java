package com.bing.product.service;

import java.util.List;

import com.bing.product.dto.ProductDto;
import com.bing.product.repository.ProductRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ProductServiceImplimentation implements ProductService {
	
	private ProductRepository productRepo;

	@Override
	public String validate(ProductDto dto) {
		if(dto!=null) {
			System.out.println("List is not null");
			if(productRepo.save(dto)) {
				System.out.println("Saved");
				return "Saved Succsesfully";
			}
		}
		return " not Saved Succsesfully";
	}

	@Override
	public List<ProductDto> getAll() {
		return productRepo.getAll();
		
	}

	@Override
	public String updateById(int productId, ProductDto dto) {
		if(productRepo.updateById(productId, dto)) {
			return "Updated";
		}
		return "Not Updated";
	}

	@Override
	public String deleteById(int productId, ProductDto dto) {
		if(productId>0) {
		if(productRepo.updateById(productId, dto)) {
			return "Deleted";
		}
		}
		return "Not Deleted";
	}

}
