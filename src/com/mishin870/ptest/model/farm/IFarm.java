package com.mishin870.ptest.model.farm;

public interface IFarm {
	
	/**
	 * Возвращает приход с этой фермы
	 */
	int getIncome();
	
	/**
	 * Потратить прочность фермы
	 * @return успех операции (если false, то прочность фермы кончилась)
	 */
	Boolean spend();
	
}
