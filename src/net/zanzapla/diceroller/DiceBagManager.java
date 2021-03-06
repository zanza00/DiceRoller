package net.zanzapla.diceroller;

import net.zanzapla.diceroller.core.BagOfDices;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;

public class DiceBagManager extends Activity {
	public final static BagOfDices DICE_BAG = new BagOfDices();
	private CheckBox d6Check, d10Check, d20Check, d100Check;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dice_bag_manager);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dice_bag_manager, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void createDiceBag(View view){
		d6Check = (CheckBox) findViewById(R.id.d6Checker);
		d10Check = (CheckBox) findViewById(R.id.d10Checker);
		d20Check = (CheckBox) findViewById(R.id.d20Checker);
		d100Check = (CheckBox) findViewById(R.id.d100Checker);
		if (d6Check.isChecked()) {
			DICE_BAG.addDice(6);
		}
		if (d10Check.isChecked()) {
			DICE_BAG.addDice(10);
		}
		if (d20Check.isChecked()) {
			DICE_BAG.addDice(20);
		}
		if (d100Check.isChecked()) {
			DICE_BAG.addDice(100);
		}
	}

}
