package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.entity.SweetOrder;
import com.cg.app.repository.SweetOrderRepository;

@Service
public class SweetOrderService {
	@Autowired
	private SweetOrderRepository sweetorderRepo;
	
	public SweetOrder addSweetOrder(SweetOrder sweetorder)
	{
		return sweetorderRepo.save(sweetorder);
	}
	
	public SweetOrder updateSweetOrder(SweetOrder sweetorder)
	{
		return sweetorderRepo.save(sweetorder);
	}
	
	public void cancelSweetOrder(int sweetorderId)
	{
		sweetorderRepo.deleteById(sweetorderId);
	}
	
	public List<SweetOrder> showAllSweetOrders()
	{
		return sweetorderRepo.findAll();
	}
	
	public double calculateTotalCost(int sweetorderId)
	{
		return 0.0;
	}
}
