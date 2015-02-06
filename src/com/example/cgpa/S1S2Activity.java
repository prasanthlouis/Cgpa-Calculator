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

public class S1S2Activity extends ActionBarActivity {
	EditText em1,engphy,engchem,engmech,enggraph,civileng,mecheng,eleceng,elecsiteng,mechwork,eleccivilwork,sgpatext;
	TextView em1t,engphyt,engchemt,engmecht,enggrapht,civilengt,mechengt,elecengt,elecsitengt,mechworkt,eleccivilworkt,sgpatextt;
	float sgpa,temp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
	    getActionBar().hide();
		setContentView(R.layout.activity_s1_s2);
		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/FARRAY.otf");
		em1t = (TextView) findViewById(R.id.maths1);
		engphyt = (TextView) findViewById(R.id.EngPhy);
		engchemt = (TextView) findViewById(R.id.engchem);
		engmecht = (TextView) findViewById(R.id.engmech);
		enggrapht = (TextView) findViewById(R.id.enggraph);
		civilengt = (TextView) findViewById(R.id.civileng);
		mechengt = (TextView) findViewById(R.id.mecheng);
		elecengt = (TextView) findViewById(R.id.ElectricalEng);
		elecsitengt = (TextView) findViewById(R.id.ElecsIT);
		mechworkt= (TextView) findViewById(R.id.mechwork);
		eleccivilworkt = (TextView) findViewById(R.id.elecandcivil);
		
		em1t.setTypeface(tf);
		engphyt.setTypeface(tf);
		engchemt.setTypeface(tf);
		engmecht.setTypeface(tf);
		enggrapht.setTypeface(tf);
		civilengt.setTypeface(tf);
		mechengt.setTypeface(tf);
		elecengt.setTypeface(tf);
		elecsitengt.setTypeface(tf);
		mechworkt.setTypeface(tf);
		eleccivilworkt.setTypeface(tf);
		
		em1=(EditText)findViewById(R.id.maths1marks);
		engphy=(EditText)findViewById(R.id.engphymarks);
		engchem=(EditText)findViewById(R.id.engchemmarks);
		engmech=(EditText)findViewById(R.id.engmechmarks);
		enggraph=(EditText)findViewById(R.id.enggraphmarks);
		civileng=(EditText)findViewById(R.id.civilengmarks);
		mecheng=(EditText)findViewById(R.id.mechengmarks);
		eleceng=(EditText)findViewById(R.id.ElectricalEngmarks);
		elecsiteng=(EditText)findViewById(R.id.ElecsITmarks);
		mechwork=(EditText)findViewById(R.id.mechworkmarks);
		eleccivilwork=(EditText)findViewById(R.id.elecandcivilmarks);
		
		
	
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
			
		if(em1.getText().toString().equals("") || 
		  engphy.getText().toString().equals("") || 
		  engchem.getText().toString().equals("") ||
		  engmech.getText().toString().equals("") || 
		  enggraph.getText().toString().equals("") ||
		  civileng.getText().toString().equals("") ||
		  mecheng.getText().toString().equals("") ||
		  eleceng.getText().toString().equals("") ||
		  elecsiteng.getText().toString().equals("") ||
		  mechwork.getText().toString().equals("") ||
		  eleccivilwork.getText().toString().equals(""))
			Toast.makeText(getApplicationContext(),"Please enter all the fields", Toast.LENGTH_LONG).show();
		else
		{
			Toast.makeText(getApplicationContext(), "Calculating", Toast.LENGTH_SHORT).show();
		   
		  
		temp=(4*(grade(engphy)+grade(engchem)+grade(civileng)+grade(mecheng)+grade(eleceng)))+5*(grade(em1)+grade(elecsiteng))+6*(grade(engmech)+grade(enggraph))+1*(grade(mechwork)+grade(eleccivilwork));
		sgpa=temp/44;
	//	sgpatext.setText(sgpa+"");
	Intent myintent=new Intent(S1S2Activity.this, Sgpacalc.class).putExtra("S1S2marks", sgpa);
		startActivity(myintent);
		}
         //Log.d(TAG, "Sending data to status activity intent: " +data);
        	
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.s1_s2, menu);
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
