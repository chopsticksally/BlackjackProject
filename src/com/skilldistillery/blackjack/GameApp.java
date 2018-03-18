package com.skilldistillery.blackjack;

import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Game game = new Game();
		game.launch(kb);
		kb.close();
	}

}
