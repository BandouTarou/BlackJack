/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.game.card;

public final class Card {

	/**
	 *
	 * @author bandou_tarou
	 */
	public enum HEART {

		HEART_ACE(1),
		HEART_DEUCE(2),
		HEART_TREY(3),
		HEART_CATER(4),
		HEART_CINQUE(5),
		HEART_SICE(6),
		HEART_SEVEN(7),
		HEART_EIGHT(8),
		HEART_NINE(9),
		HEART_TEN(10),
		HEART_JACK(11),
		HEART_QUEEN(12),
		HEART_KING(13);

		private final int number;

		private HEART(int number) {
			this.number = number;
		}

		public int getNumber() {
			return this.number;
		}

		public static String getCardName(int ordinal) {

			HEART[] cardList = HEART.values();
			return cardList[ordinal].toString();
		}

	}
	
	/**
	 *
	 * @author bandou_tarou
	 */
	public enum SPADE {

		SPADE_ACE(1),
		SPADE_DEUCE(2),
		SPADE_TREY(3),
		SPADE_CATER(4),
		SPADE_CINQUE(5),
		SPADE_SICE(6),
		SPADE_SEVEN(7),
		SPADE_EIGHT(8),
		SPADE_NINE(9),
		SPADE_TEN(10),
		SPADE_JACK(11),
		SPADE_QUEEN(12),
		SPADE_KING(13);

		private final int number;

		private SPADE(int number) {
			this.number = number;
		}

		public int getNumber() {
			return this.number;
		}

		public static String getCardName(int ordinal) {

			SPADE[] cardList = SPADE.values();
			return cardList[ordinal].toString();
		}

	}

	/**
	 *
	 * @author bandou_tarou
	 */
	public enum DIAMOND {

		DIAMOND_ACE(1),
		DIAMOND_DEUCE(2),
		DIAMOND_TREY(3),
		DIAMOND_CATER(4),
		DIAMOND_CINQUE(5),
		DIAMOND_SICE(6),
		DIAMOND_SEVEN(7),
		DIAMOND_EIGHT(8),
		DIAMOND_NINE(9),
		DIAMOND_TEN(10),
		DIAMOND_JACK(11),
		DIAMOND_QUEEN(12),
		DIAMOND_KING(13);

		private final int number;

		private DIAMOND(int number) {
			this.number = number;
		}

		public int getNumber() {
			return this.number;
		}

		public static String getCardName(int ordinal) {

			DIAMOND[] cardList = DIAMOND.values();
			return cardList[ordinal].toString();
		}

	}

	/**
	 *
	 * @author bandou_tarou
	 */
	public enum CLUB {

		CLUB_ACE(1),
		CLUB_DEUCE(2),
		CLUB_TREY(3),
		CLUB_CATER(4),
		CLUB_CINQUE(5),
		CLUB_SICE(6),
		CLUB_SEVEN(7),
		CLUB_EIGHT(8),
		CLUB_NINE(9),
		CLUB_TEN(10),
		CLUB_JACK(11),
		CLUB_QUEEN(12),
		CLUB_KING(13);

		private final int number;

		private CLUB(int number) {
			this.number = number;
		}

		public int getNumber() {
			return this.number;
		}

		public static String getCardName(int ordinal) {

			CLUB[] cardList = CLUB.values();
			return cardList[ordinal].toString();
		}

	}

	public static int getNumber(String cardName) throws Exception {

		if (cardName.startsWith("HEART")) {
			return HEART.valueOf(cardName).getNumber();
		} else if (cardName.startsWith("SPADE")) {
			return SPADE.valueOf(cardName).getNumber();
		} else if (cardName.startsWith("DIAMOND")) {
			return DIAMOND.valueOf(cardName).getNumber();
		} else if (cardName.startsWith("CLUB")) {
			return CLUB.valueOf(cardName).getNumber();
		} else {
			throw new Exception();
		}
	}
}
