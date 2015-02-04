package com.example.cgpa;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class S4Activity extends ActionBarActivity {
	EditText em,oop,dsa,scs,mp,toc,dslab,eclab,sgpatext;
	float sgpa,temp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_s4);

		
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
		em=(EditText)findViewById(R.id.EMmarks);
		oop=(EditText)findViewById(R.id.OOPmark);
		dsa=(EditText)findViewById(R.id.DSAmarks);
		scs=(EditText)findViewById(R.id.SCSmarks);
		mp=(EditText)findViewById(R.id.mpmarks);
		toc=(EditText)findViewById(R.id.TOCmarks);
		dslab=(EditText)findViewById(R.id.DSLabmarks);
		eclab=(EditText)findViewById(R.id.eclabmarks);
		temp=(4*(grade(em)+grade(oop)+grade(dsa)+grade(scs)+grade(mp)+grade(toc)))+2*(grade(dslab)+grade(eclab));
		sgpa=temp/28;
		sgpatext.setText(sgpa+"");
	Intent myintent=new Intent(S4Activity.this, Sgpacalc.class).putExtra("S4marks", sgpa);
		startActivity(myintent);
		 
         //Log.d(TAG, "Sending data to status activity intent: " +data);
        
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.s4, menu);
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
