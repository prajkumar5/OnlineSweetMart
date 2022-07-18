package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.entity.Category;
import com.cg.app.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepo;
	
	public Category addCategory(Category category)
	{
		return categoryRepo.save(category);
	}
	
	public Category updateCategory(Category category)
	{
		return categoryRepo.save(category);
	}
	
	public void cancelCategory(int categoryId)
	{
		categoryRepo.deleteById(categoryId);
	}
	
	public List<Category> showAllCategories()
	{
		return categoryRepo.findAll();
	}
	
	public double calculateTotalCost(int categoryId)
	{
		return 0.0;
	}
}
