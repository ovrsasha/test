package com.mishin870.ptest.view;

import com.mishin870.ptest.controller.GameController;
import com.mishin870.ptest.controller.commands.CommandBuyCowFarm;
import com.mishin870.ptest.controller.commands.Menu;
import com.mishin870.ptest.model.farm.IFarm;

import java.util.Scanner;

public class ConsoleView implements View {
	private final Scanner scanner = new Scanner(System.in);
	private final Menu menu = new Menu()
			.addCommand(new CommandBuyCowFarm());
	
	/**
	 * Выводит игровое поле на экран
	 */
	private void renderField(IFarm[][] field, int width, int height) {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				if (field[x][y] != null){
					System.out.print(field[x][y]);
				} else {
					System.out.print("#");
				}
				if (x < width - 1)
					System.out.print("|");
			}
			System.out.println();
			if (y < height - 1)
				System.out.println("------");
		}
	}
	
	/**
	 * Выводит количество монет на экран
	 */
	private void renderMoney(int money) {
		System.out.println(money);
	}
	
	/**
	 * Выводит меню на экран
	 */
	private void renderMenu() {
		menu.display();
	}
	
	//Сообщение, возвращённое вызовом прошлой команды меню. Для того, чтобы его было видно после очистки экрана
	private String previousMessage = "";
	
	@Override
	public void run(GameController controller, IFarm[][] field, int width, int height, int money) {
		System.out.println(previousMessage);
		renderField(field, width, height);
		renderMoney(money);
		renderMenu();
		
		previousMessage = menu.execute(scanner.nextLine(), controller);
		
		clearConsole();
	}
	
	/**
	 * "Очищает" консоль, сдвинув всё лишнее вверх
	 */
	private void clearConsole() {
		System.out.println("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
	}
}
