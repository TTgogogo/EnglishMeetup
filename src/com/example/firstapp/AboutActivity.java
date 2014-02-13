package com.example.firstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class AboutActivity extends Activity {
	
	TextView tv1, tv2, tv3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setupActionBar();
				
		setContentView(R.layout.activity_about);
		
		tv1 = (TextView)findViewById(R.id.textview1);
		tv2 = (TextView)findViewById(R.id.textview2);
		tv3 = (TextView)findViewById(R.id.textview3);
		tv1.setText("\t\t学习英语，认识世界！");
		tv2.setText("\t\t珠海英语论坛是一个公益团体，致力于组织英语口语对练活动，为珠海的英语爱好者提供便利。");
		tv3.setText("\t\t问题反馈：\t timeinzhuhai@163.com");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(false);

	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
		case R.id.action_settings:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			//NavUtils.navigateUpFromSameTask(this);
			
			Intent HomeIntent = new Intent(this, MainActivity.class);
			HomeIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			startActivity(HomeIntent);
			finish();
			overridePendingTransition(0, 0);
			return true;
		case  R.id.about_us:
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
