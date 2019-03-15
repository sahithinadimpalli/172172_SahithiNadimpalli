package com.cg.assign1;


public class Customer {

	private String customerName, customerContact; 
	private int  customerId;
	private Address customerAddress;
	public String getCustomerName() {
		return customerName;
	}
	
	
	public Customer(String customerName, String customerContact, int customerId, Address customerAddress) {
		super();
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerId = customerId;
		this.customerAddress = customerAddress;
	}


	public Customer() {
		super();
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerContact=" + customerContact + ", customerId="
				+ customerId + ", customerAddress=" + customerAddress + "]";
	}
	
	
	
}

