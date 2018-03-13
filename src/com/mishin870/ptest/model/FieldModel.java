package com.mishin870.ptest.model;

import com.mishin870.ptest.model.farm.IFarm;

/**
 * Модель управления полем
 */
public interface FieldModel {
	
	/**
	 * Установить ферму на любую позицию
	 * @param farm ферма
	 * @return успех операции
	 */
	boolean placeFarm(IFarm farm);
	
	/**
	 * Устанавливает ферму на выбранной позиции
	 * @param farm ферма для установки
	 */
	void setFarm(int x, int y, IFarm farm);
	
	/**
	 * Получить ферму по координатам
	 */
	IFarm getFarm(int x, int y);
	
	/**
	 * Собрать прибыль с ферм, снизить их прочность и т.д.
	 */
	int collectIncome();
	
	/**
	 * Получить информацию о поле для вьювера
	 */
	IFarm[][] getField();
	
}
