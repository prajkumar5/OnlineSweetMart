package com.cg.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.entity.SweetItem;
import com.cg.app.service.SweetItemService;

@RestController
public class SweetItemController {
	@Autowired
	private SweetItemService sweetitemService;
	
	@PostMapping("/addsweetitem")
	public SweetItem addSweetItem(@RequestBody SweetItem sweetitem)
	{
		return sweetitemService.addSweetItem(sweetitem);
	}
	
	@PutMapping("/updatesweetitem")
	public SweetItem updateSweetItem(@RequestBody SweetItem sweetitem)
	{
		return sweetitemService.updateSweetItem(sweetitem);
	}
	
	@DeleteMapping("/deletesweetitem")
	public String deleteSweetItem(@RequestParam int sweetitemId)
	{
		sweetitemService.cancelSweetItem(sweetitemId);
		return "Sweet Item successfully deleted";
	}
	
	@GetMapping("/getallsweetitems")
	public List<SweetItem> getAllSweetItems()
	{
		return sweetitemService.showAllSweetItems();
	}
	
}
