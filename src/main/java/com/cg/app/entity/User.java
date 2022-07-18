package com.cg.app.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long userId;
	private String username;
	private String password;
	@OneToMany
	private Set<SweetOrder> sweetOrders;
	@OneToMany
	private List<SweetItem> sweetItems;
	@OneToOne
	private Cart cart;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<SweetOrder> getSweetOrders() {
		return sweetOrders;
	}
	public void setSweetOrders(Set<SweetOrder> sweetOrders) {
		this.sweetOrders = sweetOrders;
	}
	public List<SweetItem> getSweetItems() {
		return sweetItems;
	}
	public void setSweetItems(List<SweetItem> sweetItems) {
		this.sweetItems = sweetItems;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
	
}
