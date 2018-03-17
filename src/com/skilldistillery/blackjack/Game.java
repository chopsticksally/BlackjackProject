package com.skilldistillery.blackjack;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
	Scanner kb = new Scanner (System.in);
	GameApp ga = new GameApp();
	ga.launch(kb);
	kb.close();
	}

}
