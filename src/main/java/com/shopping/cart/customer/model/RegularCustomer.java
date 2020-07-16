package com.shopping.cart.customer.model;

import java.util.ArrayList;
import java.util.List;

public class RegularCustomer implements Customer {
	private List<Slab> discountSlabs;

	public RegularCustomer() {
		discountSlabs = new ArrayList<Slab>();
		Slab s1 = new Slab(0, 5000, 0);
		Slab s2 = new Slab(5000, 10000, 10);
		Slab s3 = new Slab(10000, null, 20);
		discountSlabs.add(s1);
		discountSlabs.add(s2);
		discountSlabs.add(s3);
	}

	public List<Slab> getDiscountSlabs() {
		return discountSlabs;
	}

	public void setDiscountSlabs(List<Slab> discountSlabs) {
		this.discountSlabs = discountSlabs;
	}

}
