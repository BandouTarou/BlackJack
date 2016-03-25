/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.game.deck;

/**
 *
 * @author bandou_tarou
 */
public class DeckDirector {

	DeckBuilder builder;

	public DeckDirector(DeckBuilder builder) {
		this.builder = builder;
	}

	public void construct() {

		this.builder.addHeart();
		this.builder.addSpade();
		this.builder.addDiamond();
		this.builder.addClub();
		this.builder.addJoker();
		this.builder.shuffle();
	}
}
