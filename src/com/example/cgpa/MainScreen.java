package com.example.cgpa;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.psiuol21.cgpa.R;

public class MainScreen extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		setContentView(R.layout.activity_main_screen);

	
	}
	
	private boolean MyStartActivity(Intent aIntent) {
	    try
	    {
	        startActivity(aIntent);
	        return true;
	    }
	    catch (ActivityNotFoundException e)
	    {
	        return false;
	    }
	}
	
	public void rateus(View v)
	{
	Intent intent = new Intent(Intent.ACTION_VIEW);
    //Try Google play
    intent.setData(Uri.parse("market://details?id=com.psiuol21.cgpa"));
    if (!MyStartActivity(intent)) {
        //Market (Google play) app seems not installed, let's try to open a webbrowser
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.psiuol21.cgpa"));
        if (!MyStartActivity(intent)) {
            //Well if this also fails, we have run out of options, inform the user.
            Toast.makeText(this, "Could not open Android market, please install the market app.", Toast.LENGTH_SHORT).show();
        }
    }
	}
	public void jumpstart(View v)
	{
		Intent myIntent=new Intent(MainScreen.this,DirectCGPA.class);
		startActivity(myIntent);
	}
	public void S8(View v)
	{
		Intent myIntent=new Intent(MainScreen.this,S8Activity.class);
		startActivity(myIntent);
	}
	
	
	public void S7(View v)
	{
		Intent myIntent=new Intent(MainScreen.this,S7Activity.class);
		startActivity(myIntent);
	}
	
	public void S6(View v)
	{
		Intent myIntent=new Intent(MainScreen.this,S6Activity.class);
		startActivity(myIntent);
	}
	
	public void S5(View v)
	{
		Intent myIntent=new Intent(MainScreen.this,MainActivity.class);
		startActivity(myIntent);
	}
	
	public void S4(View v)
	{
		Intent myIntent=new Intent(MainScreen.this,S4Activity.class);
		startActivity(myIntent);
	}
	
	public void S3(View v)
	{
		Intent myIntent=new Intent(MainScreen.this,S3Activity.class);
		startActivity(myIntent);
	}
	
	public void S1S2(View v)
	{
		Intent myIntent=new Intent(MainScreen.this,S1S2Activity.class);
		startActivity(myIntent);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_screen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}



}
