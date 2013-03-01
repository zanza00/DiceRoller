package net.zanzapla.core;

public class PairOfDices {
	private Dice dice1 = new Dice();
	private Dice dice2 = new Dice();

	public void rolls() {
		dice1.roll();
		dice2.roll();
	}
	public void setFirstDiceFaces(int n){
		dice1.setDieFaces(n);
	}
}