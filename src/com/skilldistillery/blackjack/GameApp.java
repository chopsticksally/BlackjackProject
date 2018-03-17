package com.skilldistillery.blackjack;

import java.util.Scanner;

public class GameApp {
	Dealer dealer = new Dealer();
	Player player = new Player();

	public void launch(Scanner kb) {
		dealer.getDeck().shuffleDeck();
		System.out.println("Do you want to play a round of Black Jack? Y/N");
		String ans = kb.next();
		if (ans.equalsIgnoreCase("N")) {
			System.out.println("Thanks, Goodbye!");
			System.exit(0);
		}
		if (dealer.getDeck().checkDeckSize() < 10) {
			dealer.getNewDeck();
		}
		player.getHand().addCard(dealer.getDeck().dealCard());
		dealer.getHand().addCard(dealer.getDeck().dealCard());

		player.getHand().addCard(dealer.getDeck().dealCard());
		dealer.getHand().addCard(dealer.getDeck().dealCard());

		System.out.println("Your hand: " + player.getHand());
		System.out.println("Your total hand is: " + player.getHand().getHandValue());
		System.out.println("Dealer shows: " + dealer.getHand().displayTopCard());
		System.out.println("Hit Y/N: ");
		String choice = kb.next();

		while (choice.equalsIgnoreCase("Y")) {
			playerHit();
			System.out.println("Your hand: " + player.getHand());
			System.out.println("Your total hand is now: " + player.getHand().getHandValue());
			if (player.getHand().getHandValue() > 21) {
				System.out.println("You Bust with " + player.getHand().getHandValue() + " , Dealer wins");
				resetGame(kb);
			} else if (player.getHand().getHandValue() == 21) {
				System.out.println("YOU WIN with " + player.getHand().getHandValue());
				resetGame(kb);
			}
			System.out.println("Hit Y/N: ");
			choice = kb.next();

		}
		if (choice.equalsIgnoreCase("N")) {
			dealerHit();
			System.out.println("Dealer shows: " + dealer.getHand().getHandValue());

			while (dealer.getHand().getHandValue() <= 17) {
				dealerHit();
				System.out.println("Dealer shows: " + dealer.getHand().getHandValue());

				if (dealer.getHand().getHandValue() > 21) {
					System.out.println("Dealer busts, YOU WIN!");
					resetGame(kb);

				}

			}
			if (dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
				System.out.println("Dealer Wins with " + dealer.getHand().getHandValue());
				resetGame(kb);

			} else if (dealer.getHand().getHandValue() < player.getHand().getHandValue()) {
				System.out.println("YOU WIN with " + player.getHand().getHandValue());
				resetGame(kb);

			} else if (dealer.getHand().getHandValue() == player.getHand().getHandValue()) {
				System.out.println("Push");
				resetGame(kb);
			}
		}
	}

	public void playerHit() {
		player.getHand().addCard(dealer.getDeck().dealCard());
	}

	public void dealerHit() {
		dealer.getHand().addCard(dealer.getDeck().dealCard());

	}

	public void resetGame(Scanner kb) {
		dealer.getHand().clearHand();
		player.getHand().clearHand();
		launch(kb);
	}

}
