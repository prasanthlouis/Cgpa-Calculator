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

public class S7Activity extends ActionBarActivity {
	EditText wt,cc,cg,oomd,ppl,elecII,syspgmlab,networkinglab,sgpatext,seminar,mainproj;
	TextView wtt,cct,cgt,oomdt,pplt,elecIIt,syspgmlabt,networkinglabt,seminart,mainprojt;
	float sgpa,temp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/FARRAY.otf");
		setContentView(R.layout.activity_s7);

		wtt = (TextView) findViewById(R.id.WT);
		cct= (TextView) findViewById(R.id.CC);
		cgt= (TextView) findViewById(R.id.CG);
		oomdt= (TextView) findViewById(R.id.OOMD);
		pplt= (TextView) findViewById(R.id.PPL);
		elecIIt= (TextView) findViewById(R.id.elecII);
		syspgmlabt= (TextView) findViewById(R.id.syspgmlab);
		networkinglabt= (TextView) findViewById(R.id.networklab);
		seminart= (TextView) findViewById(R.id.seminar);
		mainprojt= (TextView) findViewById(R.id.mainproj);
		
		wt=(EditText)findViewById(R.id.WTmarks);
		cc=(EditText)findViewById(R.id.CCmarks);
		cg=(EditText)findViewById(R.id.CGmarks);
		oomd=(EditText)findViewById(R.id.OOMDmarks);
		ppl=(EditText)findViewById(R.id.PPLmarks);
		elecII=(EditText)findViewById(R.id.elecIImarks);
		syspgmlab=(EditText)findViewById(R.id.syspgmlabmarks);
		networkinglab=(EditText)findViewById(R.id.networklabmarks);
		seminar=(EditText)findViewById(R.id.seminarmarks);
		mainproj=(EditText)findViewById(R.id.mainprojmarks);
		
		wtt.setTypeface(tf);
		cct.setTypeface(tf);
		cgt.setTypeface(tf);
		oomdt.setTypeface(tf);
		pplt.setTypeface(tf);
		elecIIt.setTypeface(tf);
		syspgmlabt.setTypeface(tf);
		networkinglabt.setTypeface(tf);
		seminart.setTypeface(tf);
		mainprojt.setTypeface(tf);
		

		
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
	public float specgrade(int y)
	{
	
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
		
		if(wt.getText().toString().equals("") || 
				  cc.getText().toString().equals("") || 
				  oomd.getText().toString().equals("") ||
				  ppl.getText().toString().equals("") || 
				  elecII.getText().toString().equals("") ||
				  syspgmlab.getText().toString().equals("") ||
				  networkinglab.getText().toString().equals("") ||
				  seminar.getText().toString().equals("") ||
				  mainproj.getText().toString().equals(""))
					Toast.makeText(getApplicationContext(),"Please enter all the fields", Toast.LENGTH_LONG).show();
		else
		{
		Toast.makeText(getApplicationContext(), "Calculating", Toast.LENGTH_SHORT).show();
		//sgpatext=(EditText)findViewById(R.id.sgpa);
		
		temp=(4*(grade(wt)+grade(cc)+grade(elecII)))+(3*(grade(cg)+grade(oomd)+grade(ppl)))+(2*(grade(syspgmlab)+grade(networkinglab)+specgrade(3*(Integer.parseInt(seminar.getText().toString())))))+(1*(specgrade(3*(Integer.parseInt(mainproj.getText().toString())))));
		sgpa=temp/28;
		
	//	sgpatext.setText(sgpa+"");
	Intent myintent=new Intent(S7Activity.this, Sgpacalc.class).putExtra("S7marks", sgpa);
		startActivity(myintent);
		 
         //Log.d(TAG, "Sending data to status activity intent: " +data);
        
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.s7, menu);
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
