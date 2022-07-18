package com.cg.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class SweetItem {
	@Id
	private int orderItemId;
	@OneToOne
	private Product product;
	@ManyToOne
	private SweetOrder sweetOrder;
	
	public int getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public SweetOrder getSweetOrder() {
		return sweetOrder;
	}
	public void setSweetOrder(SweetOrder sweetOrder) {
		this.sweetOrder = sweetOrder;
	}
	
	
}
