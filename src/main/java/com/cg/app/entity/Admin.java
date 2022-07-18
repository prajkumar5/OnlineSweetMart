package com.cg.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Admin {
	@Id
	@GeneratedValue
	private String id;
	private String password;
	@OneToOne
	private User user;
	@OneToOne
	private SweetItem item;
	@OneToOne
	private Category category;
	@OneToOne
	private Cart cart;
	@OneToOne
	private Product product;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public SweetItem getItem() {
		return item;
	}
	public void setItem(SweetItem item) {
		this.item = item;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
