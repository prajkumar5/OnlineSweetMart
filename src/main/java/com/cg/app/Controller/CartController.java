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

import com.cg.app.entity.Cart;
import com.cg.app.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	private CartService cartService;
	
	@PostMapping("/addcart")
	public Cart addCart(@RequestBody Cart cart)
	{
		return cartService.addCart(cart);
	}
	
	@PutMapping("/updatecart")
	public Cart updateCart(@RequestBody Cart cart)
	{
		return cartService.updateCart(cart);
	}
	
	@DeleteMapping("/deletecart")
	public String deleteCart(@RequestParam int cartId)
	{
		cartService.cancelCart(cartId);
		return "User successfully deleted";
	}
	
	@GetMapping("/getallcarts")
	public List<Cart> getAllCarts()
	{
		return cartService.showAllCarts();
	}
	
	@GetMapping("/getcartbyid")
	public Cart getCartById(@RequestParam int cartId)
	{
		return cartService.showById(cartId);
	}
}
