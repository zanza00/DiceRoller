/**
 * testing class named Test.java, how original :D
 */
package net.zanzapla.core;

//import net.zanzapla.lib.TextIO;

public class Test {
	public static void main(String[] args) {
//		Dice myFirstDice = new Dice();
//		
//		System.out.println("how many dice i have to roll");
//		int numberOfRolls = TextIO.getInt();
//		
//		System.out.println("how many rolls you want to do?");
//		int tiri = TextIO.getInt();
//
//		while (tiri > 0) {
//			int result = myFirstDice.multipleRolls(numberOfRolls);
//			if (tiri == 1) {
//				System.out.print(result);
//			} else {
//				System.out.print(result + ", ");
//			}
//			tiri--;
//		}
		Dice first = new Dice();
		Dice second = new Dice();
		Operators operation = new Operators();
		
		first.roll();
		second.roll();
		System.out.println("Biggest: " + operation.compareBig(first, second));
		System.out.println("Smallest: " + operation.compareSmall(first, second));
		System.out.println("First: " + first.getValue() + " - Second: " + second.getValue());
	}

}
