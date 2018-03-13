package com.mishin870.ptest.controller;

import com.mishin870.ptest.model.FieldModel;
import com.mishin870.ptest.model.MoneyModel;
import com.mishin870.ptest.model.SimpleFieldModel;
import com.mishin870.ptest.model.SimpleMoneyModel;
import com.mishin870.ptest.model.farm.CowFarm;
import com.mishin870.ptest.model.farm.IFarm;
import com.mishin870.ptest.view.ConsoleView;
import com.mishin870.ptest.view.View;

public class GameController {
	private View view;
	private FieldModel fieldModel;
	private MoneyModel moneyModel;
	private int width, height;
	
	public GameController(int width, int height) {
		this.width = width;
		this.height = height;
		this.view = new ConsoleView();
		this.fieldModel = new SimpleFieldModel(width, height);
		this.moneyModel = new SimpleMoneyModel();
		
		this.moneyModel.setMoney(40);
	}
	
	public void execute() {
		view.run(this, fieldModel.getField(), width, height, moneyModel.getMoney());
		moneyModel.income(fieldModel.collectIncome());
	}
	
	/**
	 * Купить ферму и установить на поле
	 * @param price цена фермы
	 * @param farm ферма
	 */
	public String buyFarm(int price, IFarm farm) {
		int money = moneyModel.getMoney();
		if (money >= price) {
			if (fieldModel.placeFarm(farm)) {
				moneyModel.spend(price);
				return "Ферма успешно установлена!";
			} else {
				return "Не найдено место для установки фермы!";
			}
		} else {
			return "Недостаточно монет!";
		}
	}
}
