package com.mishin870.ptest.controller.commands;

import com.mishin870.ptest.controller.GameController;

public interface ICommand {
	
	/**
	 * Команда
	 */
	String getCommand();
	
	/**
	 * Приветствие команды
	 */
	String getTitle();
	
	/**
	 * Запуск команды
	 * @return сообщение, возвращённое командой
	 */
	String execute(GameController controller);
	
}
