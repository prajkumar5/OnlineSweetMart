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

import com.cg.app.entity.OrderBill;
import com.cg.app.service.OrderBillService;

@RestController
@RequestMapping("/orderbill")
public class OrderBillController {
	@Autowired
	private OrderBillService orderbillService;
	
	@PostMapping("/addorderbill")
	public OrderBill addOrderBill(@RequestBody OrderBill orderbill)
	{
		return orderbillService.addOrderBill(orderbill);
	}
	
	@PutMapping("/updateorderbill")
	public OrderBill updateOrderBill(@RequestBody OrderBill orderbill)
	{
		return orderbillService.updateOrderBill(orderbill);
	}
	
	@DeleteMapping("/deleteorderbill")
	public String deleteOrderBill(@RequestParam int orderbill)
	{
		orderbillService.cancelOrderBill(orderbill);
		return "Order bill successfully deleted";
	}
	
	@GetMapping("/getallorderbills")
	public List<OrderBill> getAllOrderBills()
	{
		return orderbillService.showAllOrderBills();
	}
	
	@GetMapping("/getorderbillbyid")
	public OrderBill getOrderBillById(@RequestParam int orderbill)
	{
		return orderbillService.showOrderBillById(orderbill);
	}
}
