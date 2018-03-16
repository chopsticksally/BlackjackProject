package com.skilldistillery.blackjack;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class GameApp {
	private Deck deck = new Deck();

	public static void main(String[] args) {
		GameApp ga = new GameApp();
		Scanner scanner = new Scanner(System.in);
		ga.start(scanner);
		scanner.close();

	}

	private void start(Scanner scanner) {

		System.out.println("How many cards would you like? ");
		int howMany = 0;

		try {
			howMany = scanner.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("That is not a number");
		}
		if (howMany > 52) {
			System.out.println("Not enough cards for that.");
			return;
		}
		for (int i = 0; i < howMany; i++) {
			Card card = deck.dealCard();
			System.out.println(card);
		}
		System.out.println("There are " + deck.checkDeckSize() + " cards left");

	}
}
