package com.dayfourth;

public class Customer {
	private String CustomerName;
	private int CustomerId;
	private String CustomerCity;
	
	
	public Customer()
	{
		System.out.println("hello this is default constructor....");
	}


	


	public Customer(String customerName, int customerId, String customerCity) {
		super();
		CustomerName = customerName;
		CustomerId = customerId;
		CustomerCity = customerCity;
	}





	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}


	public int getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}


	public String getCustomerCity() {
		return CustomerCity;
	}


	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}


	@Override
	public String toString() {
		return "Constructordemo [CustomerName=" + CustomerName + ", CustomerId=" + CustomerId + ", CustomerCity="
				+ CustomerCity + "]";
	}
	
	

}
