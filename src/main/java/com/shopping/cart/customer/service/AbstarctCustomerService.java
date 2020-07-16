package com.shopping.cart.customer.service;

import java.util.List;

import com.shopping.cart.customer.model.Slab;

public abstract class AbstarctCustomerService implements CustomerService {

	public abstract Integer applyDiscount(Integer ammount);

	public Integer apply(Integer ammount, List<Slab> discountSlabs) {
		Integer discount = 0;
		for (Slab slab : discountSlabs) {
			if (ammount < slab.getMinAmount()) {
				break;
			}
			if (slab.getMaxAmount() != null && ammount > slab.getMaxAmount()) {
				discount += getDiscountedValue(slab.getMaxAmount() - slab.getMinAmount(), slab);
			} else {
				discount += getDiscountedValue((ammount - slab.getMinAmount()), slab);
			}
		}
		return discount;
	}
 
	public Integer getDiscountedValue(Integer ammount, Slab slab) {
		Integer discount = (ammount * slab.getDiscount()) / 100;
		return discount;
	}
}
