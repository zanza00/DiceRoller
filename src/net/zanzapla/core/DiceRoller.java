package net.zanzapla.core;

import net.zanzapla.lib.TextIO;

public class DiceRoller {
	public static void main(String[] args) {
		Dice myFirstDice = new Dice();
		int numberOfRolls = 2;
		
		System.out.println("how many rolls you want to do");
		int tiri = TextIO.getInt();

		while (tiri > 0) {
			int result = myFirstDice.multipleRolls(numberOfRolls);
			if (tiri == 1) {
				System.out.print(result);
			} else {
				System.out.print(result + ", ");
			}
			tiri--;
		}
	}

}
