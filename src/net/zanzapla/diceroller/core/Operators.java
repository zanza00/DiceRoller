package net.zanzapla.diceroller.core;

public class Operators {
	
	/**
	 * compare two dice to see which one has the biggest value
	 * @param dice1
	 * @param dice2
	 * @return string "equals" or "dice 1" or "dice 2"
	 */
	public String compareBig(Dice dice1, Dice dice2){
		if (dice1.getValue() == dice2.getValue()){
			return "equals";
		} else if (dice1.getValue() > dice2.getValue()){
			return "dice 1";
		} else  {
			return "dice 2";
		}		
	}
	/**
	 * compare two dice to see which one has the smallest value
	 * @param dice1
	 * @param dice2
	 * @return string "equals" or "dice 1" or "dice 2"
	 */
	public String compareSmall(Dice dice1, Dice dice2){
		if (dice1.getValue() == dice2.getValue()){
			return "equals";
		} else if (dice1.getValue() < dice2.getValue()){
			return "dice 1";
		} else  {
			return "dice 2";
		}		
	}
	
	/**
	 * 
	 * @param dice1
	 * @param dice2
	 * @return true if are equals false if not
	 */
	public boolean equals(Dice dice1, Dice dice2){
		if (dice1.getValue() == dice2.getValue()){
			return true;
		} else  {
			return false;
		}
	}
	/**
	 * 
	 * @param dice
	 * @param i
	 * @return the roll plus i
	 */
	public int addX(Dice dice, int i){
		dice.roll();
		return dice.getValue() + i; 
	}
}
