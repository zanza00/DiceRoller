package net.zanzapla.diceroller;

import net.zanzapla.diceroller.core.Dice;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
public final static String EXTRA_MESSAGE = "net.zanzapla.diceroller.MESSAGE";	
public static Dice dice = new Dice();
private TextView resultText, resultValue;
private String text;
private String result;
static final String TEXT_STATUS = "HERp_DERp";
static final String RESULT_STATUS = "HALP";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SetupActivity();
		
	    if (savedInstanceState != null) {
	        // Restore value of members from saved state
	        text = savedInstanceState.getString(TEXT_STATUS);
	        result = savedInstanceState.getString(RESULT_STATUS);
	        drawResults();
	    }
		
		
	}
	
	
    private void SetupActivity() {
		// TODO Auto-generated method stub
		resultText = (TextView) findViewById(R.id.textResultTextView);
		resultValue = (TextView) findViewById(R.id.numberResultTextView);
		
	}

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putString(TEXT_STATUS, text);
        savedInstanceState.putString(RESULT_STATUS, result);
        
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

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
		case 6: text = getResources().getString(R.string.rolled_dice_six);
		break;
		case 10: text = getResources().getString(R.string.rolled_dice_ten);
		break;
		case 20: text = getResources().getString(R.string.rolled_dice_twenty);
		break;
		case 100: text = getResources().getString(R.string.rolled_dice_hundred);
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
	public void goToDiceBag(View view){
		Intent intent = new Intent(this, DiceBagManager.class);
		startActivity(intent);
	}
}