package core;

import java.util.Random;

/**
 * @author Zanza
 * 
 *
 */
public class dice {
	private int dieFaces = 6;
	private int numberOfRolls = 0;
	Random randGen = new Random();

	public int getDieFaces() {
		return dieFaces;
	}

	public void setDieFaces(int n) {
		dieFaces = n;
	}

	public int Roll() {
		numberOfRolls++;
		return randGen.nextInt(dieFaces) + 1;
	}

	public int getNumberOfRolls() {
		return numberOfRolls;
	}

	public int multipleRolls(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += this.Roll();
		}
		return result;
	}

}
