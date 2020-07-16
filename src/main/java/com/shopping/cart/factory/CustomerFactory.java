package com.shopping.cart.factory;

import com.shopping.cart.customer.model.Customer;
import com.shopping.cart.customer.model.PremiumCustomer;
import com.shopping.cart.customer.model.RegularCustomer;
import com.shopping.cart.customer.service.CustomerService;
import com.shopping.cart.customer.service.PremiumCustomerService;
import com.shopping.cart.customer.service.RegularCustomerService;
import com.shopping.cart.util.CustomerType;

public class CustomerFactory {
	public static Customer getCustomer(CustomerType customerType) {
		Customer instance = null;
		switch (customerType) {
		case REGULAR:
			instance = new RegularCustomer();
			break;
		case PREMIUM:
			instance = new PremiumCustomer();
			break;

		default:
			break;
		}
		return instance;
	}
	
	public static CustomerService getCustomerService(CustomerType customerType) {
		CustomerService instance = null;
		switch (customerType) {
		case REGULAR:
			instance = new RegularCustomerService();
			break;
		case PREMIUM:
			instance = new PremiumCustomerService();
			break;

		default:
			break;
		}
		return instance;
	}
}
