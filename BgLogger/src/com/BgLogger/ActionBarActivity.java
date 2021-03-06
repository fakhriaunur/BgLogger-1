
package com.BgLogger;

import com.BgLogger.activity.calling.CallMainActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * @creator  Hansika
 * @editor 	 Limas Baginta,
 * Created:	 27/08/2015, 
 * Modified: 29/11/2015
 */
public class ActionBarActivity extends FragmentActivity {

	ActionBar actionbar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		actionbar = getActionBar();
		actionbar.setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case android.R.id.home:
			this.finish();
			break;
		case R.id.action_settings:
			break;
		case R.id.emergency_calling:
			Intent i = new Intent(ActionBarActivity.this,
					CallMainActivity.class);
			startActivity(i);
			break;
		case R.id.help:
			Intent b = new Intent(ActionBarActivity.this,
					Help.class);
			startActivity(b);
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void title(String title){
		actionbar.setTitle(title);
	}
}
