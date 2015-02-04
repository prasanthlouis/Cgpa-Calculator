package com.example.cgpa;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
EditText em,pom,dbms,dsp,os,amp,dblab,hwmplab,sgpatext;
float sgpa,temp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	
	}
	
	public float grade(EditText x)
	{
		int y=Integer.parseInt(x.getText().toString());
		if(y>=136)
			return 10;
		else if(y>=121)
			return 9;
		else if(y>=106)
			return 8;
		else if(y>=91)
			return 7;
		else if(y>=83)
			return 6;
		else if(y>=75)
			return (float) 5.5;
		else
			return 0;
		
	}
	

	public void calculate(View v)
	{
		Toast.makeText(getApplicationContext(), "Calculating", Toast.LENGTH_SHORT).show();
		sgpatext=(EditText)findViewById(R.id.sgpa);
		em=(EditText)findViewById(R.id.Mathsmark);
		pom=(EditText)findViewById(R.id.POMmark);
		dbms=(EditText)findViewById(R.id.DBMSmark);
		dsp=(EditText)findViewById(R.id.DSPmark);
		os=(EditText)findViewById(R.id.OSmark);
		amp=(EditText)findViewById(R.id.AMPmark);
		dblab=(EditText)findViewById(R.id.DBLabmark);
		hwmplab=(EditText)findViewById(R.id.HWMPlabmark);
		temp=(4*(grade(em)+grade(pom)+grade(dbms)+grade(dsp)+grade(os)+grade(amp)))+2*(grade(dblab)+grade(hwmplab));
		sgpa=temp/28;
		sgpatext.setText(sgpa+"");
		Intent myintent=new Intent(MainActivity.this, Sgpacalc.class).putExtra("S5marks", sgpa);
		startActivity(myintent);
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */


}
