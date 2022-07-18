package com.cg.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.entity.Category;
import com.cg.app.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/addcategory")
	public Category addCategory(@RequestBody Category category)
	{
		return categoryService.addCategory(category);
	}
	
	@PutMapping("/updatecategory")
	public Category updateCategory(@RequestBody Category category)
	{
		return categoryService.updateCategory(category);
	}
	
	@DeleteMapping("/deletecategory")
	public String deleteCategory(@RequestParam int categoryId)
	{
		categoryService.cancelCategory(categoryId);
		return "Category successfully removed";
	}
	
	@GetMapping("/getallcategories")
	public List<Category> getAllCategories()
	{
		return categoryService.showAllCategories();
	}
	
	@GetMapping("/totalcost")
	public double calculateTotalCost(@RequestParam int categoryId)
	{
		return categoryService.calculateTotalCost(0);
	}
}
