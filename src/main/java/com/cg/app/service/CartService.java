package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.app.entity.Cart;
import com.cg.app.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepo;
	
	public Cart addCart(Cart cart)
	{
		return cartRepo.save(cart);
	}
	
	public Cart updateCart(Cart cart)
	{
		return cartRepo.save(cart);
	}
	
	public void cancelCart(int cartId)
	{
		cartRepo.deleteById(cartId);
	}
	
	public List<Cart> showAllCarts()
	{
		return cartRepo.findAll();
	}
	
	public Cart showById(@RequestParam int userId)
	{
		return cartRepo.getReferenceById(userId);
	}

}
