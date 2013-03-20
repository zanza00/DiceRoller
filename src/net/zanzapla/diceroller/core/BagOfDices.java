package net.zanzapla.diceroller.core;

public class BagOfDices {

	private Dice[] bag; //the bag of dices
	private int bagModifier = 0;

	/**
	 * create a new bag of dices, all with 6 faces
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

	public BagOfDices() {
		// TODO Auto-generated constructor stub
		bag = new Dice[0];
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
	 * @return the bagModifier
	 */
	public int getBagModifier() {
		return bagModifier;
	}

	/**
	 * @param bagModifier the bagModifier to set
	 */
	public void setBagModifier(int bagModifier) {
		this.bagModifier = bagModifier;
	}

	/**
	 * @return the bagTotalValue
	 */
	public int getBagTotalValue() {
		int result = 0;
		for (int i = 0; i < bag.length; i++) {
			result += bag[i].getValue();
		}
		return result + bagModifier;
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
	public int[] getValue() {
		int[] result = new int[bag.length];
		for (int i = 0; i < bag.length; i++) {
			result[i] = bag[i].getValue();
		}
		return result;
	}

	public void addDice(int dieFaces) {
		// TODO Auto-generated method stub
		Dice[] tmp = new Dice[bag.length +1];
		for (int i = 0; i < bag.length; i++) {
			tmp[i] = bag[i];
		}
		tmp[tmp.length].setDieFaces(dieFaces);
		bag = tmp;
	}
	
	public int numberOfDices(){
		return bag.length+1;
	}
}
