package com.customer.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class Customerdao  {
	
	@Autowired
	private EntityManager eManager;
	
	public Object getCustomerDetails(String custId)
	{
		return eManager.createNamedStoredProcedureQuery("GetCustomerDetail").setParameter("CustGuId", custId).getSingleResult();
	}
	
	
}
