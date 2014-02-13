package com.example.firstapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.webkit.*;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity{

	WebView webv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		webv = (WebView)findViewById(R.id.mybrowser);
		
		Resources res = getResources();
		String[] week = res.getStringArray(R.array.Week);
		
		for(int i = 0; i<week.length; i++){
			Log.v("StrExample", week[i]);
		}


		String myURL = "https://timeinzhuhai.github.com";
		WebSettings websettings = webv.getSettings();
		websettings.setSupportZoom(true);
		websettings.setBuiltInZoomControls(true);
		websettings.setJavaScriptEnabled(true);
		
		webv.setWebViewClient(new WebViewClient());
		webv.loadUrl(myURL);
		
		Log.v("FirstApp", "In onCreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
			case R.id.action_settings:
				Intent HomeIntent = new Intent(this, MainActivity.class);
				HomeIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				startActivity(HomeIntent);
				finish();
				overridePendingTransition(0, 0);
				return true;
			case R.id.about_us:
				Intent AboutIntent = new Intent(this, AboutActivity.class);
				AboutIntent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				startActivity(AboutIntent);
				finish();
				overridePendingTransition(0, 0);
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
	
/*	public void onClick(View v){
		tv.setText("Congrats! Li Na!");	
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://timeinzhuhai.github.com"));
		startActivity(intent);
	} */

}
