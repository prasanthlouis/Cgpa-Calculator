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

public class S8Activity extends ActionBarActivity {
	EditText hpc,ai,sic,elecIII,elecIV,cglab,mainprojs8,vivavoice,sgpatext;
	TextView hpct,ait,sict,elecIIIt,elecIVt,cglabt,mainprojs8t,vivavoicet;
	float sgpa,temp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/FARRAY.otf");
		setContentView(R.layout.activity_s8);
		
		hpct = (TextView) findViewById(R.id.HPC);
		ait= (TextView) findViewById(R.id.AI);
		sict= (TextView) findViewById(R.id.SIC);
		elecIIIt= (TextView) findViewById(R.id.elecIII);
		elecIVt= (TextView) findViewById(R.id.elecIV);
		cglabt= (TextView) findViewById(R.id.CGlab);
		mainprojs8t= (TextView) findViewById(R.id.MainProjectS8);
		vivavoicet= (TextView) findViewById(R.id.VivaVoice);
		
		hpct.setTypeface(tf);
		ait.setTypeface(tf);
		sict.setTypeface(tf);
		elecIIIt.setTypeface(tf);
		elecIVt.setTypeface(tf);
		cglabt.setTypeface(tf);
		mainprojs8t.setTypeface(tf);
		vivavoicet.setTypeface(tf);
		
		hpc=(EditText)findViewById(R.id.HPCmarks);
		ai=(EditText)findViewById(R.id.AImarks);
		sic=(EditText)findViewById(R.id.SICmarks);
		elecIII=(EditText)findViewById(R.id.elecIIImarks);
		elecIV=(EditText)findViewById(R.id.elecIVmarks);
		cglab=(EditText)findViewById(R.id.CGlabmarks);
		mainprojs8=(EditText)findViewById(R.id.MainProjectS8marks);
		vivavoice=(EditText)findViewById(R.id.VivaVoicemarks);
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
	
		if(hpc.getText().toString().equals("") || 
				  ai.getText().toString().equals("") || 
				  sic.getText().toString().equals("") ||
				  elecIII.getText().toString().equals("") || 
				  elecIV.getText().toString().equals("") ||
				  cglab.getText().toString().equals("") ||
				  mainprojs8.getText().toString().equals("") ||
				  vivavoice.getText().toString().equals(""))
					Toast.makeText(getApplicationContext(),"Please enter all the fields", Toast.LENGTH_LONG).show();
		else
		{
		
		Toast.makeText(getApplicationContext(), "Calculating", Toast.LENGTH_SHORT).show();
	//	sgpatext=(EditText)findViewById(R.id.sgpa);
		
		temp=(4*(grade(hpc)+grade(ai)+grade(sic)+grade(elecIII)+grade(elecIV)+grade(mainprojs8)))+2*(grade(cglab)+grade(vivavoice));
		sgpa=temp/28;
	//	sgpatext.setText(sgpa+"");
	Intent myintent=new Intent(S8Activity.this, Sgpacalc.class).putExtra("S8marks", sgpa);
		startActivity(myintent);
		 
         //Log.d(TAG, "Sending data to status activity intent: " +data);
		}
		
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.s8, menu);
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
