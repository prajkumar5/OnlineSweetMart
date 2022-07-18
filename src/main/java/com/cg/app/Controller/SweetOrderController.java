package com.cg.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.entity.SweetOrder;
import com.cg.app.service.SweetOrderService;

@RestController
@RequestMapping("/sweetorder")
public class SweetOrderController {
	@Autowired
	private SweetOrderService sweetorderService;
	
	@PostMapping("/addsweetorder")
	public SweetOrder addSweetOrder(@RequestBody SweetOrder sweetorder)
	{
		return sweetorderService.addSweetOrder(sweetorder);
	}
	
	@PutMapping("/updatesweetorder")
	public SweetOrder updateSweetOrder(@RequestBody SweetOrder sweetorder)
	{
		return sweetorderService.updateSweetOrder(sweetorder);
	}
	
	@DeleteMapping("/deletesweetorder")
	public String deleteSweetOrder(@RequestParam int sweetorderId)
	{
		sweetorderService.cancelSweetOrder(sweetorderId);
		return "Sweetorder successfully deleted";
	}
	
	@GetMapping("/getallsweetorders")
	public List<SweetOrder> getAllSweetOrders()
	{
		return sweetorderService.showAllSweetOrders();
	}
	
}
