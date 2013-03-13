package net.zanzapla.diceroller;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


import net.zanzapla.diceroller.core.*;

public class MainActivity extends Activity {
	
public final static String EXTRA_MESSAGE = "net.zanzapla.diceroller.MESSAGE";	
public static Dice dice;
private TextView resultDisplay, resultDisplayDice;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		resultDisplay = (TextView) findViewById(R.id.resultTextView);
		resultDisplayDice = (TextView) findViewById(R.id.numberResultTextView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void onClickRoll(View btn){
		dice = new Dice();
		dice.setDieFaces();
		dice.roll();
		String result = dice.getStrValue();
		String text = "hai tirato un dado da 6";
		resultDisplayDice.setText(text);
		resultDisplay.setText(result);
		
	}
	public void onClickRoll100(View btn){
		dice = new Dice();
		dice.setDieFaces(100);
		dice.roll();
		String result = dice.getStrValue();
		String text = "hai tirato un dado da 100";
		resultDisplayDice.setText(text);
		resultDisplay.setText(result);
	}
	public void onClickRoll20(View btn){
		dice = new Dice();
		dice.setDieFaces(20);
		dice.roll();
		String result = dice.getStrValue();
		String text = "hai tirato un dado da 20";
		resultDisplayDice.setText(text);
		resultDisplay.setText(result);
		
	}
	public void onClickRoll10(View btn){
		dice = new Dice();
		dice.setDieFaces(10);
		dice.roll();
		String result = dice.getStrValue();
		String text = "hai tirato un dado da 10";
		resultDisplayDice.setText(text);
		resultDisplay.setText(result);
		
	}
}
