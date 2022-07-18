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

import com.cg.app.entity.Product;
import com.cg.app.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product)
	{
		return productService.addProduct(product);
	}
	
	@PutMapping("/updateproduct")
	public Product updateUser(@RequestBody Product product)
	{
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("/deleteproduct")
	public String deleteProduct(@RequestParam int productId)
	{
		productService.cancelProduct(productId);
		return "Product successfully deleted";
	}
	
	@GetMapping("/getallproducts")
	public List<Product> getAllProducts()
	{
		return productService.showAllProducts();
	}
	
	@GetMapping("/getproductbyid")
	public Product getProductById(@RequestParam int productId)
	{
		return productService.showProductById(productId);
	}
}
