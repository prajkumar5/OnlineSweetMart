package com.cg.app.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SweetOrder {
	@Id
	private int sweetOrderId;
	@ManyToOne(targetEntity = User.class)
	private User user;
	@ElementCollection
	private List<SweetItem> listItems;
	private LocalDate createdDate;
	@ElementCollection
	private Map<Product,Long> groupedProducts;
	
	public int getSweetOrderId() {
		return sweetOrderId;
	}
	public void setSweetOrderId(int sweetOrderId) {
		this.sweetOrderId = sweetOrderId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<SweetItem> getListItems() {
		return listItems;
	}
	public void setListItems(List<SweetItem> listItems) {
		this.listItems = listItems;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public Map<Product, Long> getGroupedProducts() {
		return groupedProducts;
	}
	public void setGroupedProducts(Map<Product, Long> groupedProducts) {
		this.groupedProducts = groupedProducts;
	}
	
}
