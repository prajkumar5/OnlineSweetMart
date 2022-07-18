package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.entity.OrderBill;
import com.cg.app.repository.OrderBillRepository;

@Service
public class OrderBillService {
	
	@Autowired
	private OrderBillRepository orderbillRepo;
	
	public OrderBill addOrderBill(OrderBill orderbill)
	{
		return orderbillRepo.save(orderbill);
	}
	
	public OrderBill updateOrderBill(OrderBill orderbill)
	{
		return orderbillRepo.save(orderbill);
	}
	
	public void cancelOrderBill(int orderbillId)
	{
		orderbillRepo.deleteById(orderbillId);
	}
	
	public List<OrderBill> showAllOrderBills()
	{
		return orderbillRepo.findAll();
	}
	
	public OrderBill showOrderBillById(int orderbillId)
	{
		return orderbillRepo.getReferenceById(orderbillId);
	}

}
