/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.game.main;

import jp.co.game.logic.GameLogic;

/**
 * 
 * @author bandou_tarou
 */
public class GameMain {

	public static void main(String args[]) {
		
		GameLogic logic = new GameLogic();
		
		logic.execute();
	}
}
