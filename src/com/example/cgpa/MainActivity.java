package com.example.cgpa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.psiuol21.cgpa.R;

public class MainActivity extends ActionBarActivity {
EditText em,pom,dbms,dsp,os,amp,dblab,hwmplab,sgpatext;
TextView emt,pomt,dbmst,dspt,ost,ampt,dblabt,hwmplabt;
float sgpa,temp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/FARRAY.otf");
		setContentView(R.layout.activity_main);
		
		emt = (TextView) findViewById(R.id.Maths);
		pomt = (TextView) findViewById(R.id.POM);
		dbmst = (TextView) findViewById(R.id.DBMS);
		dspt = (TextView) findViewById(R.id.DSP);
		ost = (TextView) findViewById(R.id.OS);
		ampt = (TextView) findViewById(R.id.AMP);
		dblabt = (TextView) findViewById(R.id.DBLab);
		hwmplabt = (TextView) findViewById(R.id.HWMPlab);
		
		em=(EditText)findViewById(R.id.Mathsmark);
		pom=(EditText)findViewById(R.id.POMmark);
		dbms=(EditText)findViewById(R.id.DBMSmark);
		dsp=(EditText)findViewById(R.id.DSPmark);
		os=(EditText)findViewById(R.id.OSmark);
		amp=(EditText)findViewById(R.id.AMPmark);
		dblab=(EditText)findViewById(R.id.DBLabmark);
		hwmplab=(EditText)findViewById(R.id.HWMPlabmark);
		
		emt.setTypeface(tf);
		pomt.setTypeface(tf);
		dbmst.setTypeface(tf);
		dspt.setTypeface(tf);
		ost.setTypeface(tf);
		ampt.setTypeface(tf);
		dblabt.setTypeface(tf);
		hwmplabt.setTypeface(tf);

	
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
		
		if(em.getText().toString().equals("") || 
				  pom.getText().toString().equals("") || 
				  dbms.getText().toString().equals("") ||
				  dsp.getText().toString().equals("") || 
				  os.getText().toString().equals("") ||
				  amp.getText().toString().equals("") ||
				  dblab.getText().toString().equals("") ||
				  hwmplab.getText().toString().equals(""))
					Toast.makeText(getApplicationContext(),"Please enter all the fields", Toast.LENGTH_LONG).show();
		else
		{
		Toast.makeText(getApplicationContext(), "Calculating", Toast.LENGTH_SHORT).show();
	//	sgpatext=(EditText)findViewById(R.id.sgpa);
		
		temp=(4*(grade(em)+grade(pom)+grade(dbms)+grade(dsp)+grade(os)+grade(amp)))+2*(grade(dblab)+grade(hwmplab));
		sgpa=temp/28;
	//	sgpatext.setText(sgpa+"");
		Intent myintent=new Intent(MainActivity.this, Sgpacalc.class).putExtra("S5marks", sgpa);
		startActivity(myintent);
		}
		
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
