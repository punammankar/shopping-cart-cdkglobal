package com.shopping.cart.customer.service;

import com.shopping.cart.customer.model.Customer;
import com.shopping.cart.factory.CustomerFactory;
import com.shopping.cart.util.CustomerType;

public class PremiumCustomerService extends AbstarctCustomerService{

	@Override
	public Integer applyDiscount(Integer ammount) {
		Customer customer = CustomerFactory.getCustomer(CustomerType.PREMIUM);
		return ammount - apply(ammount, customer.getDiscountSlabs());
	}

}
