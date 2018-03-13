package com.mishin870.ptest.controller.commands;

import com.mishin870.ptest.controller.GameController;
import com.mishin870.ptest.model.farm.CowFarm;

public class CommandBuyCowFarm implements ICommand {
	private static final int COW_FARM_PRICE = 40;
	private static final int COW_FARM_DURABILITY = 20;
	
	@Override
	public String getCommand() {
		return "cow";
	}
	
	@Override
	public String getTitle() {
		return "Купить ферму коров за " + COW_FARM_PRICE + " монет";
	}
	
	@Override
	public String execute(GameController controller) {
		return controller.buyFarm(
				COW_FARM_PRICE,
				new CowFarm().setAmount(COW_FARM_DURABILITY)
		);
	}
	
}
