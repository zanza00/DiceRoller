package net.zanzapla.core;

import net.zanzapla.lib.TextIO;

public class MainActivity {
	public static void main(String[] args) {
		dice myFirstDice = new dice();
		int numberOfRolls = 2;
		
		System.out.println("inserisci quanti tiri vuoi fare");
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
