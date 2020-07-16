package com.shopping.cart;

import com.shopping.cart.customer.service.CustomerService;
import com.shopping.cart.factory.CustomerFactory;
import com.shopping.cart.util.CustomerType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//System.out.println((5000 * 10)/100);
    	CustomerType customerType = CustomerType.find("Premium");
        CustomerService customerService = CustomerFactory.getCustomerService(customerType);
        System.out.println(customerService.applyDiscount(20000));
    }
}
