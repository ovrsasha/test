package com.mishin870.ptest.controller.commands;

import com.mishin870.ptest.controller.GameController;

import java.util.ArrayList;

public class Menu {
	private ArrayList<ICommand> commands = new ArrayList<ICommand>();
	
	/**
	 * Добавить команду в меню
	 */
	public Menu addCommand(ICommand command) {
		commands.add(command);
		return this;
	}
	
	public void display() {
		System.out.println("Меню:");
		for (ICommand command : commands) {
			System.out.println(command.getCommand() + " - " + command.getTitle());
		}
	}
	
	/**
	 * Запуск какой-либо команды
	 */
	public String execute(String input, GameController controller) {
		if (input == null || input.length() == 0)
			return "";
		
		for (ICommand command : commands) {
			if (command.getCommand().equals(input)) {
				return command.execute(controller);
			}
		}
		
		return "Команда не найдена!";
	}
	
}
