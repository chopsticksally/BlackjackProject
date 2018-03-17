package com.skilldistillery.blackjack;

import com.skilldistillery.cards.common.*;

public class Dealer {
	private Hand dealerHand = new Hand();
	private Deck deck = new Deck();
	
	public void getNewDeck() {
		deck = new Deck();
	}

	public Hand getHand() {
		return dealerHand;
	}

	public Deck getDeck() {
		return deck;
	}

}
