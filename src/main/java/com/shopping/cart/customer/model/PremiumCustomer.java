package com.shopping.cart.customer.model;

import java.util.ArrayList;
import java.util.List;

public class PremiumCustomer implements Customer{

	private List<Slab> discountSlabs;

	public PremiumCustomer() {
		discountSlabs = new ArrayList<Slab>();
		Slab s4 = new Slab(0, 4000, 10);
		Slab s5 = new Slab(4000, 8000, 15);
		Slab s6 = new Slab(8000, 12000, 20);
		Slab s7 = new Slab(12000, null, 30);
		discountSlabs.add(s4);
		discountSlabs.add(s5);
		discountSlabs.add(s6);
		discountSlabs.add(s7);
	}

	public List<Slab> getDiscountSlabs() {
		return discountSlabs;
	}

	public void setDiscountSlabs(List<Slab> discountSlabs) {
		this.discountSlabs = discountSlabs;
	}

}
