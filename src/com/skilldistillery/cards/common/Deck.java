package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public List<Card> deck;

	public Deck() {
		deck = new ArrayList<>();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				Card card = new Card(rank, suit);
				deck.add(card);
 
			}
		}

	}
	public int checkDeckSize() {
		return deck.size();
	}
	public Card dealCard() {
		return deck.remove(0);
	}
	public void shuffleDeck() {
		Collections.shuffle(deck);
	}
	

}
