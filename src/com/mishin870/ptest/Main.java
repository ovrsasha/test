package com.mishin870.ptest;

import com.mishin870.ptest.controller.GameController;

public class Main {
	public static GameController gameController;
	
	public static void main(String[] args) {
		gameController = new GameController(3, 3);
		while (true) {
			gameController.execute();
		}
	}
	
}
