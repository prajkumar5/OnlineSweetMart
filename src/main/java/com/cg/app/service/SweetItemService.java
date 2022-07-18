package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.entity.SweetItem;
import com.cg.app.repository.SweetItemRepository;

@Service
public class SweetItemService {
	@Autowired
	private SweetItemRepository sweetitemRepo;
	
	public SweetItem addSweetItem(SweetItem sweetitem)
	{
		return sweetitemRepo.save(sweetitem);
	}
	
	public SweetItem updateSweetItem(SweetItem sweetitem)
	{
		return sweetitemRepo.save(sweetitem);
	}
	
	public void cancelSweetItem(int sweetitemId)
	{
		sweetitemRepo.deleteById(sweetitemId);
	}
	
	public List<SweetItem> showAllSweetItems()
	{
		return sweetitemRepo.findAll();
	}
	
}
