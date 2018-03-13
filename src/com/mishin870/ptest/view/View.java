package com.mishin870.ptest.view;

import com.mishin870.ptest.controller.GameController;
import com.mishin870.ptest.model.farm.IFarm;

public interface View {
	
	/**
	 * Запуск одного цикла вывода и ввода
	 * @param controller ссылка на контроллер
	 * @param field игровое поле
	 * @param width ширина игрового поля
	 * @param height высота игрового поля
	 * @param money количество монет
	 */
	void run(GameController controller, IFarm[][] field, int width, int height, int money);
	
}
