/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.game.logic;

import java.util.ArrayList;
import java.util.List;
import jp.co.game.deck.DeckDirector;
import jp.co.game.deck.blackjack.BlackJackDeckBuilder;

/**
 *
 * @author bandou_tarou
 */
public class GameLogic {

	List<String> deck;

	public void execute() {

		this.initialize();

	}

	private void initialize() {

		this.deck = new ArrayList<>();

		DeckDirector director
			= new DeckDirector(new BlackJackDeckBuilder(deck));
		director.construct();
	}
}
