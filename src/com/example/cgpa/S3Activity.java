package com.example.cgpa;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class S3Activity extends ActionBarActivity {
	EditText emII,ecskills,pscp,co,stld,edc,pgmlab,ldlab,sgpatext;
	float sgpa,temp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_s3);

	
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
		//sgpatext=(EditText)findViewById(R.id.sgpa);
		emII=(EditText)findViewById(R.id.emIImarks);
		ecskills=(EditText)findViewById(R.id.Economicsmarks);
		pscp=(EditText)findViewById(R.id.PSCPmarks);
		co=(EditText)findViewById(R.id.COmarks);
		stld=(EditText)findViewById(R.id.STLDmarks);
		edc=(EditText)findViewById(R.id.EDCmarks);
		pgmlab=(EditText)findViewById(R.id.Programminglabmarks);
		ldlab=(EditText)findViewById(R.id.LogicDesignlabmarks);
		temp=(4*(grade(emII)+grade(ecskills)+grade(pscp)+grade(co)+grade(stld)+grade(edc)))+2*(grade(pgmlab)+grade(ldlab));
		sgpa=temp/28;
		//Toast.makeText(getApplicationContext(), sgpa+"", Toast.LENGTH_SHORT).show();
	//	sgpatext.setText(sgpa+"");
	Intent myintent=new Intent(S3Activity.this, Sgpacalc.class).putExtra("S3marks", sgpa);
		startActivity(myintent);
		 
         //Log.d(TAG, "Sending data to status activity intent: " +data);
        
		
		
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.s3, menu);
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
