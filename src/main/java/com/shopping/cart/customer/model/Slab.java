package com.shopping.cart.customer.model;

public final class Slab {
	private Integer minAmount;
	private Integer maxAmount;
	private Integer discount;

	public Integer getMinAmount() {
		return minAmount;
	}

	public Integer getMaxAmount() {
		return maxAmount;
	}

	public Integer getDiscount() {
		return discount;
	}

	public Slab(Integer minAmount, Integer maxAmount, Integer discount) {
		this.minAmount = minAmount;
		this.maxAmount = maxAmount;
		this.discount = discount;
	}

}
