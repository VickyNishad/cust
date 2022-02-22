package com.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dao.Customerdao;

@RestController
public class MyController {

	@Autowired
	private Customerdao customerdao;
	

	
	@GetMapping("/customer/{custId}")
	public Object getDetails( @PathVariable String custId)
	{
		return this.customerdao.getCustomerDetails(custId);
	}
}
