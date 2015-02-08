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

public class S6Activity extends ActionBarActivity {
	EditText daa,ic,ss,cn,se,elec,oslab,miniproj,sgpatext;
	TextView daat,ict,sst,cnt,set,elect,oslabt,miniprojt;
	float sgpa,temp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/FARRAY.otf");
		setContentView(R.layout.activity_s6);

		daat = (TextView) findViewById(R.id.DAA);
		ict= (TextView) findViewById(R.id.IC);
		sst= (TextView) findViewById(R.id.SS);
		cnt= (TextView) findViewById(R.id.CN);
		set= (TextView) findViewById(R.id.SE);
		elect= (TextView) findViewById(R.id.Elec);
		oslabt= (TextView) findViewById(R.id.OSlab);
		miniprojt= (TextView) findViewById(R.id.miniproj);
		
		daa=(EditText)findViewById(R.id.DAAmarks);
		ic=(EditText)findViewById(R.id.ICmarks);
		ss=(EditText)findViewById(R.id.SSmarks);
		cn=(EditText)findViewById(R.id.CNmarks);
		se=(EditText)findViewById(R.id.SEmarks);
		elec=(EditText)findViewById(R.id.Elecmarks);
		oslab=(EditText)findViewById(R.id.OSLabmarks);
		miniproj=(EditText)findViewById(R.id.miniprojmarks);
		
		
		daat.setTypeface(tf);
		ict.setTypeface(tf);
		sst.setTypeface(tf);
		cnt.setTypeface(tf);
		set.setTypeface(tf);
		elect.setTypeface(tf);
		oslabt.setTypeface(tf);
		miniprojt.setTypeface(tf);
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
	
		if(daa.getText().toString().equals("") || 
				  ic.getText().toString().equals("") || 
				  ss.getText().toString().equals("") ||
				  cn.getText().toString().equals("") || 
				  se.getText().toString().equals("") ||
				  elec.getText().toString().equals("") ||
				  oslab.getText().toString().equals("") ||
				  miniproj.getText().toString().equals(""))
					Toast.makeText(getApplicationContext(),"Please enter all the fields", Toast.LENGTH_LONG).show();
		else
		{
		Toast.makeText(getApplicationContext(), "Calculating", Toast.LENGTH_SHORT).show();
	//	sgpatext=(EditText)findViewById(R.id.sgpa);
		
		temp=(4*(grade(daa)+grade(ic)+grade(ss)+grade(cn)+grade(se)+grade(elec)))+2*(grade(oslab)+grade(miniproj));
		sgpa=temp/28;
	//sgpatext.setText(sgpa+"");
		Intent myintent=new Intent(S6Activity.this, Sgpacalc.class).putExtra("S6marks", sgpa);
		startActivity(myintent);
		
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.s6, menu);
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
