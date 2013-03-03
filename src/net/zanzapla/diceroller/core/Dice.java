package net.zanzapla.diceroller.core;

import java.util.Random;

/**
 * A class that's define a simple dice, the default dice has 6 faces it also
 * keep track of the number of rolls made by that particular dice
 * 
 */
public class Dice {

	private int dieFaces; // number of faces
	private int dieValue; // the current value of the dice

	private int numberOfRolls = 0; // number of rolls
	Random randGen = new Random(); // random

	/**
	 * set the faces to 6, default, and roll the dice when it's created
	 */
	public Dice() {
		this.setDieFaces();
		this.roll();
	}

	/**
	 * set the faces of the dice and roll
	 * 
	 * @param numberOfFaces
	 *            the number of faces of the dice
	 */
	public Dice(int numberOfFaces) {
		this.setDieFaces(numberOfFaces);
	}

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
	public void setDieFaces(int numberOfFaces) {
		dieFaces = numberOfFaces;
	}

	/**
	 * set to 6, default value
	 */
	public void setDieFaces() {
		setDieFaces(6);
	}

	/**
	 * 
	 * Perform a roll with the dice, use getDiceValue() to know the result
	 */
	public void roll() {
		numberOfRolls++;
		dieValue = randGen.nextInt(dieFaces) + 1;
	}

	/**
	 * 
	 * @return the last result of the roll()
	 */
	public int getValue() {
		return dieValue;
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
			roll();
			result += this.getValue();
		}
		return result;
	}
}