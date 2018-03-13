package com.mishin870.ptest.model;

public class SimpleMoneyModel implements MoneyModel {
	private int money = 0;
	
	@Override
	public int getMoney() {
		return money;
	}
	
	@Override
	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public void spend(int price) {
		money -= price;
	}
	
	@Override
	public void income(int profit) {
		money += profit;
	}
	
}
