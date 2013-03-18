package net.zanzapla.diceroller;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import net.zanzapla.diceroller.core.*;

public class MainActivity extends Activity {
	
public final static String EXTRA_MESSAGE = "net.zanzapla.diceroller.MESSAGE";	
public static Dice dice = new Dice();
private TextView resultText, resultValue;
<<<<<<< HEAD
private String text;
private String result;
static final String TEXT_STATUS = "0";
static final String RESULT_STATUS = "0";
=======
private String text= "0";
private String result="0";
>>>>>>> f617fc8fca932be56265c7f9fd6fa962fa281700

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SetupActivity();
<<<<<<< HEAD
		
	    if (savedInstanceState != null) {
	        // Restore value of members from saved state
	        text = savedInstanceState.getString(TEXT_STATUS);
	        result = savedInstanceState.getString(RESULT_STATUS);
	        drawResults();
	    }
		
		
	}
	
	
    private void SetupActivity() {
=======
		if (!text.equals("0")) {
			drawResults();
		}
		
	}
	
	
    @Override

    public void onConfigurationChanged(Configuration newConfig) {

    	super.onConfigurationChanged(newConfig);
    	setContentView(R.layout.activity_main);
    	text = (String) resultText.getText();

    	drawResults();

    }


	private void SetupActivity() {
>>>>>>> f617fc8fca932be56265c7f9fd6fa962fa281700
		// TODO Auto-generated method stub
		resultText = (TextView) findViewById(R.id.textResultTextView);
		resultValue = (TextView) findViewById(R.id.numberResultTextView);
		
	}

<<<<<<< HEAD
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putString(TEXT_STATUS, text);
        savedInstanceState.putString(RESULT_STATUS, result);
        
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

/*	@Override
    public void onConfigurationChanged(Configuration newConfig) {

    	super.onConfigurationChanged(newConfig);
    	setContentView(R.layout.activity_main);

    	drawResults();

    }*/

=======
>>>>>>> f617fc8fca932be56265c7f9fd6fa962fa281700

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void onClickRoll(View btn){
		int dieFaces = Integer.parseInt((String) btn.getTag());		
		dice.setDieFaces(dieFaces);
		dice.roll();
		result = dice.getStrValue();
		switch (dieFaces) {
		case 6: text = getResources().getString(R.string.dice_six);
		break;
		case 10: text = getResources().getString(R.string.dice_ten);
		break;
		case 20: text = getResources().getString(R.string.dice_twenty);
		break;
		case 100: text = getResources().getString(R.string.dice_hundred);
		break;

		default: text = "HALP!";
		break;

		}
		drawResults();
		
	}
	
	public void drawResults() {
		resultText.setText(text);
		resultText.setWidth(90);
		resultValue.setText(result);
		resultValue.setTextSize(100);
	}
}
