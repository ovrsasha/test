package com.mishin870.ptest.model.farm;

/**
 * Продает молоко с коров
 */
public class CowFarm implements IFarm {
	private int amount;
	
	public CowFarm setAmount(int amount) {
		this.amount = amount;
		return this;
	}
	
	@Override
	public int getIncome() {
		return 100;
	}
	
	@Override
	public Boolean spend() {
		amount--;
		return amount > 0;
	}
	
	@Override
	public String toString() {
		return "C";
	}
	
}
