package net.zanzapla.core;

import java.util.Random;

/**
 * A class that's define a simple dice, the default dice has 6 faces it also
 * keep track of the number of rolls made by that particular dice
 * 
 */
public class Dice {

	private int dieFaces = 6;
	private int numberOfRolls = 0;
	Random randGen = new Random();

	/**
	 * 
	 * @return the number of faces of the dice
	 */
	public int getDieFaces() {
		return dieFaces;
	}

	/**
	 * set the number of faces, default is 6
	 * 
	 * @param
	 */
	public void setDieFaces(int n) {
		dieFaces = n;
	}

	/**
	 * 
	 * @return a int of the roll
	 */
	public int roll() {
		numberOfRolls++;
		return randGen.nextInt(dieFaces) + 1;
	}

	/**
	 * 
	 * @return the number of rolls made by the dice
	 */
	public int getNumberOfRolls() {
		return numberOfRolls;
	}

	/**
	 * a quick way to do multiple rolls
	 * 
	 * @param number
	 *            of rolls
	 * @return the sum of the rolls
	 */

	public int multipleRolls(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += roll();
		}
		return result;
	}

}
