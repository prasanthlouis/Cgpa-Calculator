package com.example.cgpa;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.psiuol21.cgpa.R;

public class Sgpacalc extends ActionBarActivity {
float s1s2mar,s3mar,s4mar,s5mar,s6mar,s7mar,s8mar;
TextView s1t,s3t,s4t,s5t,s6t,s7t,s8t,cgpat;
EditText s1s2,s3,s4,s5,s6,s7,s8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		setContentView(R.layout.activity_sgpacalc);
		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/FARRAY.otf");
		
		
		s1t = (TextView) findViewById(R.id.S1S2);
		s3t = (TextView) findViewById(R.id.S3);
		s4t = (TextView) findViewById(R.id.S4);
		s5t = (TextView) findViewById(R.id.S5);
		s6t = (TextView) findViewById(R.id.S6);
		s7t = (TextView) findViewById(R.id.S7);
		s8t = (TextView) findViewById(R.id.S8);
		cgpat = (TextView) findViewById(R.id.Final);
		
		s1t.setTypeface(tf);
		s3t.setTypeface(tf);
		s4t.setTypeface(tf);
		s5t.setTypeface(tf);
		s6t.setTypeface(tf);
		s7t.setTypeface(tf);
		s8t.setTypeface(tf);
		cgpat.setTypeface(tf);
		
	
		
		Bundle extras = getIntent().getExtras();
			
		
		//s1s2 marks
		s1s2mar = extras.getFloat("S1S2marks");
		if(s1s2mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s1s2mar,"s1s2mar");
		}
		s1s2mar = ((MyApplication) this.getApplication()).getSomeVariable("s1s2mar");
		s1s2=(EditText)findViewById(R.id.S1S2marks);
		s1s2.setText(s1s2mar+"");
		
		//s3marks
		s3mar = extras.getFloat("S3marks");
		//s4 marks
		if(s3mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s3mar,"s3mar");
		}
		s3mar = ((MyApplication) this.getApplication()).getSomeVariable("s3mar");
		s3=(EditText)findViewById(R.id.S3marks);
		s3.setText(s3mar+"");
		
		
		s4mar = extras.getFloat("S4marks");
		//s4 marks
		if(s4mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s4mar,"s4mar");
		}
		s4mar = ((MyApplication) this.getApplication()).getSomeVariable("s4mar");
		s4=(EditText)findViewById(R.id.S4marks);
		s4.setText(s4mar+"");
		
		
		//s5 marks
		s5mar = extras.getFloat("S5marks");
		if(s5mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s5mar,"s5mar");
		}
		s5mar = ((MyApplication) this.getApplication()).getSomeVariable("s5mar");
		s5=(EditText)findViewById(R.id.S5marks);
		s5.setText(s5mar+"");
		
		//s6marks
		s6mar = extras.getFloat("S6marks");
		//s4 marks
		if(s6mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s6mar,"s6mar");
		}
		s6mar = ((MyApplication) this.getApplication()).getSomeVariable("s6mar");
		s6=(EditText)findViewById(R.id.S6marks);
		s6.setText(s6mar+"");
		
		//s7marks
		s7mar = extras.getFloat("S7marks");
		if(s7mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s7mar,"s7mar");
		}
		s7mar = ((MyApplication) this.getApplication()).getSomeVariable("s7mar");
		s7=(EditText)findViewById(R.id.S7marks);
		s7.setText(s7mar+"");
		
		//s8marks
		s8mar = extras.getFloat("S8marks");
		if(s8mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s8mar,"s8mar");
		}
		s8mar = ((MyApplication) this.getApplication()).getSomeVariable("s8mar");
		s8=(EditText)findViewById(R.id.S8marks);
		s8.setText(s8mar+"");
		
	
	}
			
					
		
		
		
	
	
	
	public void finalcalc(View v)
	{
		float s1s2c,s3c,s4c,s5c,s6c,s7c,s8c;
		float finalcgpa=((44*(s1s2c=Float.parseFloat(s1s2.getText().toString())))+(28*((s3c=Float.parseFloat(s3.getText().toString()))+(s4c=Float.parseFloat(s4.getText().toString()))+(s5c=Float.parseFloat(s5.getText().toString()))+(s6c=Float.parseFloat(s6.getText().toString()))+(s7c=Float.parseFloat(s7.getText().toString()))+(s8c=Float.parseFloat(s8.getText().toString())))))/(44+((s3c=Float.parseFloat(s3.getText().toString()))>0?28:0)+((s4c=Float.parseFloat(s4.getText().toString()))>0?28:0)+((s5c=Float.parseFloat(s5.getText().toString()))>0?28:0)+((s6c=Float.parseFloat(s6.getText().toString()))>0?28:0)+((s7c=Float.parseFloat(s7.getText().toString()))>0?28:0)+((s8c=Float.parseFloat(s8.getText().toString()))>0?28:0));
		EditText finalthankfully=(EditText)findViewById(R.id.CGPAmarks);
		finalthankfully.setText(finalcgpa+"");
	}
	
	
	public void back(View v)
	{
		Intent myintent=new Intent(Sgpacalc.this, MainScreen.class);
		startActivity(myintent);
	}
	
	/*public void onRestoreInstanceState(Bundle savedInstanceState) {
		  super.onRestoreInstanceState(savedInstanceState);
		  Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_LONG).show();
		  float myInt = savedInstanceState.getFloat("S4marks");
		  Toast.makeText(getApplicationContext(), myInt+"", Toast.LENGTH_LONG).show();
	}
	
	protected void onSaveInstanceState(Bundle savedInstanceState) {
		super.onSaveInstanceState(savedInstanceState);
		 savedInstanceState.putFloat("S4marks", s4mar);
		//  super.onSaveInstanceState(savedInstanceState);
		   Toast.makeText(getApplicationContext(), "Saved array", Toast.LENGTH_SHORT).show();
		   finish();
			 
		
		}*/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sgpacalc, menu);
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
