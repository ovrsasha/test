package com.mishin870.ptest.model;

/**
 * Модель управления монетами
 */
public interface MoneyModel {
	
	/**
	 * Возвращает количество монет
	 */
	int getMoney();
	
	/**
	 * Устанавливает количество монет
	 */
	void setMoney(int money);
	
	/**
	 * Тратит определённое количество монет
	 * @param price цена
	 */
	void spend(int price);
	
	/**
	 * Добавляет прибыль к монетам
	 * @param profit прибыль
	 */
	void income(int profit);
	
}
