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
public interface DeckBuilder {

	public void addHeart();

	public void addSpade();

	public void addDiamond();

	public void addClub();

	public void addJoker();

	public void shuffle();

}
