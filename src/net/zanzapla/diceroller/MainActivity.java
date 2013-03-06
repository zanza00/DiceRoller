package net.zanzapla.diceroller;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;


import net.zanzapla.diceroller.core.*;

public class MainActivity extends Activity {
	
public final static String EXTRA_MESSAGE = "net.zanzapla.diceroller.MESSAGE";	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void onClickRoll(View btn){
		Intent intent = new Intent(this, DisplayRollActivity.class);
		Dice dice = new Dice();
		dice.roll();
		String result = dice.getStrValue();		
		intent.putExtra(EXTRA_MESSAGE, result);
		startActivity(intent);
		
	}
	
	

}
