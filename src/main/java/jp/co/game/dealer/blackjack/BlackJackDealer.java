/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.game.dealer.blackjack;

import java.util.List;
import jp.co.game.dealer.Dealer;

/**
 *
 * @author bandou_tarou
 */
public class BlackJackDealer implements Dealer {

	private List<String> deck;

	public BlackJackDealer(List<String> deck) {
		this.deck = deck;
	}

	@Override
	public void dealOut() {

	}

}
