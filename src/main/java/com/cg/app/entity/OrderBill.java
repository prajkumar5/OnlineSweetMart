package com.cg.app.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OrderBill {
	@Id
	private int orderBillId;
	private LocalDate createdDate;
	private float totalCost;
	@OneToMany
	private List<SweetOrder> listSweetOrder;
	
	public int getOrderBill() {
		return orderBillId;
	}
	public void setOrderBill(int orderBill) {
		this.orderBillId = orderBill;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	public List<SweetOrder> getListSweetOrder() {
		return listSweetOrder;
	}
	public void setListSweetOrder(List<SweetOrder> listSweetOrder) {
		this.listSweetOrder = listSweetOrder;
	}
	
	
}
