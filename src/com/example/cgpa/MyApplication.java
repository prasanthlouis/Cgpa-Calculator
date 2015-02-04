package com.example.cgpa;
import android.app.Application;

public class MyApplication extends Application {

    private float s1s2marks,s4marks,s5marks,s6marks;

    public float getSomeVariable(String variable) {
    	if(variable.equals("s4mar"))
    		return s4marks;
    	else if(variable.equals("s5mar"))
    		return s5marks;
    	else if(variable.equals("s6mar"))
    		return s6marks;
    	else if(variable.equals("s1s2mar"))
    		return s1s2marks;
    	else
    		return 0;
        
    }

	public void setSomeVariable(float variable,String name) {
		// TODO Auto-generated method stub
		if(name.equals("s4mar"))
		this.s4marks=variable;
		else if(name.equals("s5mar"))
		this.s5marks=variable;
		else if(name.equals("s6mar"))
			this.s6marks=variable;
		else if(name.equals("s1s2mar"))
			this.s1s2marks=variable;
	}

 


}
