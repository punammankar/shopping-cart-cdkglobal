package com.shopping.cart.customer.service;

import com.shopping.cart.customer.model.Customer;
import com.shopping.cart.factory.CustomerFactory;
import com.shopping.cart.util.CustomerType;

public class RegularCustomerService extends AbstarctCustomerService{

	@Override
	public Integer applyDiscount(Integer ammount) {
		Customer customer = CustomerFactory.getCustomer(CustomerType.REGULAR);
		return ammount - apply(ammount, customer.getDiscountSlabs());
	}

}
