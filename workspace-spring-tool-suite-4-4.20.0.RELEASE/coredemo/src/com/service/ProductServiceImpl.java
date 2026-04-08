package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService {
	
	
	static List<Product> plist = new ArrayList<>();
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		plist.add(p);
		System.out.println(".................product added successfully.......");
		
	}

	@Override
	public void deleteProduct(int index) {
		// TODO Auto-generated method stub
		plist.remove(index);
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return plist;
	}

}
