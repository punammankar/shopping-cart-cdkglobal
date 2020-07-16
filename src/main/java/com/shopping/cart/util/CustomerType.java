package com.shopping.cart.util;

public enum CustomerType {
	REGULAR("Regular"),
	PREMIUM("Premium");
	
	private String type;

	private CustomerType(String type) {
		this.type = type;
	}
	
	public static CustomerType find(String type) {
		for(CustomerType customerType : CustomerType.values()) {
			if(customerType.type.equals(type)) {
				return customerType;
			}
		}
		return null;
	}
	
}
