package net.zanzapla.core;

public class PairOfDices {
	dice dice1 = new dice();
	dice dice2 = new dice();

	public void roll() {
		dice1.Roll();
		dice2.Roll();
	}
}
