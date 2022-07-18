package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.entity.Product;
import com.cg.app.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepo;
	
	public Product addProduct(Product product)
	{
		return productRepo.save(product);
	}
	
	public Product updateProduct(Product product)
	{
		return productRepo.save(product);
	}
	
	public void cancelProduct(int productId)
	{
		productRepo.deleteById(productId);
	}
	
	public List<Product> showAllProducts()
	{
		return productRepo.findAll();
	}
	
	public Product showProductById(int productId)
	{
		return productRepo.getReferenceById(productId);
	}
}
