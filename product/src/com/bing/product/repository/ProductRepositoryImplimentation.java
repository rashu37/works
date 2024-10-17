package com.bing.product.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.bing.product.dto.ProductDto;


public class ProductRepositoryImplimentation implements ProductRepository {
     
	LinkedList<ProductDto> list=new LinkedList<ProductDto>();
	
	@Override
	public boolean save(ProductDto dto) {
		System.out.println("Save method");
		return list.add(dto);
	}

	@Override
	public List<ProductDto> getAll() {
		return list;
	}

	@Override
	public boolean updateById(int productId, ProductDto dto) {
		if(productId!=0) {
			for (int i = 0; i <list.size(); i++) {
				if(list.get(i)!=null && list.get(i).getProductId()==productId) {
					list.get(i).setProductName("Chair");
					
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int productId, ProductDto dto) {
		if(!list.isEmpty()) {
			for (int i = 0; i <list.size(); i++) {
				if(list.get(i)!=null && list.get(i).getProductId()==productId) {
			      list.remove(i);
					return true;
				}
			}
		}
		
		return false;
	}

}
