package com.example.cgpa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sgpacalc extends ActionBarActivity {
float s1s2mar,s3mar,s4mar,s5mar,s6mar,s7mar,s8mar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sgpacalc);
		
		Bundle extras = getIntent().getExtras();
		//s1s2 marks
		s1s2mar = extras.getFloat("S1S2marks");
		if(s1s2mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s1s2mar,"s1s2mar");
		}
		s1s2mar = ((MyApplication) this.getApplication()).getSomeVariable("s1s2mar");
		EditText s1s2=(EditText)findViewById(R.id.S1S2marks);
		s1s2.setText(s1s2mar+"");
		
		//s3marks
		s3mar = extras.getFloat("S3marks");
		//s4 marks
		if(s3mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s3mar,"s3mar");
		}
		s3mar = ((MyApplication) this.getApplication()).getSomeVariable("s3mar");
		EditText s3=(EditText)findViewById(R.id.S3marks);
		s3.setText(s3mar+"");
		
		
		s4mar = extras.getFloat("S4marks");
		//s4 marks
		if(s4mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s4mar,"s4mar");
		}
		s4mar = ((MyApplication) this.getApplication()).getSomeVariable("s4mar");
		EditText s4=(EditText)findViewById(R.id.S4marks);
		s4.setText(s4mar+"");
		
		
		//s5 marks
		s5mar = extras.getFloat("S5marks");
		if(s5mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s5mar,"s5mar");
		}
		s5mar = ((MyApplication) this.getApplication()).getSomeVariable("s5mar");
		EditText s5=(EditText)findViewById(R.id.S5marks);
		s5.setText(s5mar+"");
		
		//s6marks
		s6mar = extras.getFloat("S6marks");
		//s4 marks
		if(s6mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s6mar,"s6mar");
		}
		s6mar = ((MyApplication) this.getApplication()).getSomeVariable("s6mar");
		EditText s6=(EditText)findViewById(R.id.S6marks);
		s6.setText(s6mar+"");
		
		//s7marks
		s7mar = extras.getFloat("S7marks");
		if(s7mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s7mar,"s7mar");
		}
		s7mar = ((MyApplication) this.getApplication()).getSomeVariable("s7mar");
		EditText s7=(EditText)findViewById(R.id.S7marks);
		s7.setText(s7mar+"");
		
		//s8marks
		s8mar = extras.getFloat("S8marks");
		if(s8mar!=0.0)
		{
		((MyApplication) this.getApplication()).setSomeVariable(s8mar,"s8mar");
		}
		s8mar = ((MyApplication) this.getApplication()).getSomeVariable("s8mar");
		EditText s8=(EditText)findViewById(R.id.S8marks);
		s8.setText(s8mar+"");
		
		
	
	}
	
	public void finalcalc(View v)
	{
		float finalcgpa=((44*s1s2mar)+(28*(s3mar+s4mar+s5mar+s6mar+s7mar+s8mar)))/(44+(s3mar>0?28:0)+(s4mar>0?28:0)+(s5mar>0?28:0)+(s6mar>0?28:0)+(s7mar>0?28:0)+(s8mar>0?28:0));
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
