package com.skilldistillery.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;

public class Hand {
	private List<Card> cards = new ArrayList<Card>();

	public void addCard(Card card) {
		cards.add(card);

	}

	public void clearHand() {
		cards = new ArrayList<Card>();
	}

	public int getHandValue() {
		int counter = 0;
		for (Card card : cards) {
			counter += card.getValue();
		}
		return counter;
		
	}
	public Card displayTopCard() {
		return cards.get(0);
	}
	
	
	public List <Card> getHand(){
		return cards;
	}

	@Override
	public String toString() {
		return cards.toString() ;
	}
}
