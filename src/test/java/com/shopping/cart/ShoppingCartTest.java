package com.shopping.cart;

import org.junit.Test;

import com.shopping.cart.customer.service.CustomerService;
import com.shopping.cart.factory.CustomerFactory;
import com.shopping.cart.util.CustomerType;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class ShoppingCartTest extends TestCase {
	private static final Integer FIVE_K = 5000;
	private static final Integer TEN_K = 10000;
	private static final Integer FIFTEEN_K = 15000;
	
	private static final Integer FOUR_K = 4000;
	private static final Integer EIGHT_K = 8000;
	private static final Integer TWELVE_K = 12000;
	private static final Integer TWENTY_K = 20000;
	
	 public ShoppingCartTest(String testName) {
		super(testName);
	}

	@Test
	public void testRegularCustomer() {
		CustomerType customerType = CustomerType.find("Regular");
        CustomerService customerService = CustomerFactory.getCustomerService(customerType);
        Integer discount1 = customerService.applyDiscount(FIVE_K);
        Integer discount2 = customerService.applyDiscount(TEN_K);
        Integer discount3 = customerService.applyDiscount(FIFTEEN_K);
        System.out.println("Regular Customer");
        System.out.println(String.format("Amount - %d : Discount - %d", FIVE_K, discount1));
        System.out.println(String.format("Amount - %d : Discount - %d", TEN_K, discount2));
        System.out.println(String.format("Amount - %d : Discount - %d", FIFTEEN_K, discount3));
        System.out.println("#############################################################");
       
		assertEquals(FIVE_K, discount1);
		assertEquals(Integer.valueOf(9500), discount2);
		assertEquals(Integer.valueOf(13500), discount3);
	}
	
	@Test
	public void testPremiumCustomer() {
		CustomerType customerType = CustomerType.find("Premium");
        CustomerService customerService = CustomerFactory.getCustomerService(customerType);
        Integer discount1 = customerService.applyDiscount(FOUR_K);
        Integer discount2 = customerService.applyDiscount(EIGHT_K);
        Integer discount3 = customerService.applyDiscount(TWELVE_K);
        Integer discount4 = customerService.applyDiscount(TWENTY_K);
        
        System.out.println("Premium Customer");
        System.out.println(String.format("Amount - %d : Discount - %d", FOUR_K, discount1));
        System.out.println(String.format("Amount - %d : Discount - %d", EIGHT_K, discount2));
        System.out.println(String.format("Amount - %d : Discount - %d", TWELVE_K, discount3));
        System.out.println(String.format("Amount - %d : Discount - %d", TWENTY_K, discount4));
        System.out.println("#############################################################");
       
		assertEquals(Integer.valueOf(3600), discount1);
		assertEquals(Integer.valueOf(7000), discount2);
		assertEquals(Integer.valueOf(10200), discount3);
		assertEquals(Integer.valueOf(15800), discount4);
	}
}
