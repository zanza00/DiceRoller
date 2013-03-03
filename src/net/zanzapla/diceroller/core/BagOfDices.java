package net.zanzapla.diceroller.core;

public class BagOfDices {

	private Dice[] bag;

	/**
	 * create a new bag of dices, all with
	 * 
	 * @param numberofDice
	 *            the number of dices in the bag
	 * @return an array of dices
	 */
	public BagOfDices(int numberOfDice) {
		bag = new Dice[numberOfDice];
		for (int i = 0; i < numberOfDice; i++) {
			bag[i] = new Dice();
		}
	}

	/**
	 * 
	 * @param numberOfDice
	 *            the number of dices
	 * @param numberOfFaces
	 *            number of the faces of ALL the dices
	 */
	public BagOfDices(int numberOfDice, int numberOfFaces) {
		bag = new Dice[numberOfDice];
		for (int i = 0; i < numberOfDice; i++) {
			bag[i] = new Dice(numberOfFaces);
		}
	}

	/**
	 * 
	 * @param dicePosition
	 *            the position of the dice starting from 1
	 * @param numOfDiceFaces
	 *            the new number of faces of the dice
	 */
	public void changeDiceFaces(int dicePosition, int numOfDiceFaces) {
		bag[dicePosition - 1].setDieFaces(numOfDiceFaces);
	}

	/**
	 * roll all the dice in the bag
	 */
	public void rolls() {
		for (int i = 0; i < bag.length; i++) {
			bag[i].roll();
		}
	}

	/**
	 * 
	 * @return an array of all the results of the various roll()
	 */
	@SuppressWarnings("null")
	public int[] getValue() {
		int[] result = null;
		for (int i = 0; i < bag.length; i++) {
			result[i] = bag[i].getValue();
		}
		return result;
	}
}
