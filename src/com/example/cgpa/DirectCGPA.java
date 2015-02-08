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
import com.psiuol21.cgpa.R;

public class DirectCGPA extends ActionBarActivity {
	TextView s1t,s3t,s4t,s5t,s6t,s7t,s8t,cgpat;
	EditText s1s2e,s3e,s4e,s5e,s6e,s7e,s8e;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		setContentView(R.layout.activity_direct_cgp);

Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/FARRAY.otf");
		
		
		s1t = (TextView) findViewById(R.id.S1S2dup);
		s3t = (TextView) findViewById(R.id.S3dup);
		s4t = (TextView) findViewById(R.id.S4dup);
		s5t = (TextView) findViewById(R.id.S5dup);
		s6t = (TextView) findViewById(R.id.S6dup);
		s7t = (TextView) findViewById(R.id.S7dup);
		s8t = (TextView) findViewById(R.id.S8dup);
		cgpat = (TextView) findViewById(R.id.Finaldup);
		
		s1t.setTypeface(tf);
		s3t.setTypeface(tf);
		s4t.setTypeface(tf);
		s5t.setTypeface(tf);
		s6t.setTypeface(tf);
		s7t.setTypeface(tf);
		s8t.setTypeface(tf);
		cgpat.setTypeface(tf);
		
		s1s2e=(EditText)findViewById(R.id.S1S2marksdup);
		s3e=(EditText)findViewById(R.id.S3marksdup);
		s4e=(EditText)findViewById(R.id.S4marksdup);
		s5e=(EditText)findViewById(R.id.S5marksdup);
		s6e=(EditText)findViewById(R.id.S6marksdup);
		s7e=(EditText)findViewById(R.id.S7marksdup);
		s8e=(EditText)findViewById(R.id.S8marksdup);
		
		s1s2e.setText(0.0+"");
		s3e.setText(0.0+"");
		s4e.setText(0.0+"");
		s5e.setText(0.0+"");
		s6e.setText(0.0+"");
		s7e.setText(0.0+"");
		s8e.setText(0.0+"");
		
	
		
	}
	
	public void back(View v)
	{
		Intent myintent=new Intent(DirectCGPA.this, MainScreen.class);
		startActivity(myintent);
	}

	public void finalcalc(View v)
	{
		float s1s2c,s3c,s4c,s5c,s6c,s7c,s8c;
		float finalcgpa=((44*(s1s2c=Float.parseFloat(s1s2e.getText().toString())))+(28*((s3c=Float.parseFloat(s3e.getText().toString()))+(s4c=Float.parseFloat(s4e.getText().toString()))+(s5c=Float.parseFloat(s5e.getText().toString()))+(s6c=Float.parseFloat(s6e.getText().toString()))+(s7c=Float.parseFloat(s7e.getText().toString()))+(s8c=Float.parseFloat(s8e.getText().toString())))))/(44+((s3c=Float.parseFloat(s3e.getText().toString()))>0?28:0)+((s4c=Float.parseFloat(s4e.getText().toString()))>0?28:0)+((s5c=Float.parseFloat(s5e.getText().toString()))>0?28:0)+((s6c=Float.parseFloat(s6e.getText().toString()))>0?28:0)+((s7c=Float.parseFloat(s7e.getText().toString()))>0?28:0)+((s8c=Float.parseFloat(s8e.getText().toString()))>0?28:0));
		EditText finalthankfully=(EditText)findViewById(R.id.CGPAmarksdup);
		finalthankfully.setText(finalcgpa+"");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.direct_cg, menu);
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
