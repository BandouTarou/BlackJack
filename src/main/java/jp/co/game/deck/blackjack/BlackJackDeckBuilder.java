/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.game.deck.blackjack;

import java.util.Collections;
import java.util.List;
import jp.co.game.card.Card.CLUB;
import jp.co.game.card.Card.DIAMOND;
import jp.co.game.card.Card.HEART;
import jp.co.game.card.Card.SPADE;
import jp.co.game.deck.DeckBuilder;

/**
 *
 * @author bandou_tarou
 */
public class BlackJackDeckBuilder implements DeckBuilder {

	private final List<String> deck;

	public BlackJackDeckBuilder(List<String> deck) {
		this.deck = deck;
	}

	@Override
	public void addHeart() {
		for (int i = 0; i <= 12; i++) {
			this.deck.add(HEART.getCardName(i));
		}
	}

	@Override
	public void addSpade() {
		for (int i = 0; i <= 12; i++) {
			this.deck.add(SPADE.getCardName(i));
		}
	}

	@Override
	public void addDiamond() {
		for (int i = 0; i <= 12; i++) {
			this.deck.add(DIAMOND.getCardName(i));
		}
	}

	@Override
	public void addClub() {
		for (int i = 0; i <= 12; i++) {
			this.deck.add(CLUB.getCardName(i));
		}
	}

	@Override
	public void addJoker() {
		// do nothing
	}

	@Override
	public void shuffle() {
		Collections.shuffle(deck);
	}

}
