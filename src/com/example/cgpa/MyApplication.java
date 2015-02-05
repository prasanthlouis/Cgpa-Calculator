package com.example.cgpa;
import android.app.Application;

public class MyApplication extends Application {

    private float s1s2marks,s3marks,s4marks,s5marks,s6marks,s7marks,s8marks;

    public float getSomeVariable(String variable) {
    	if(variable.equals("s4mar"))
    		return s4marks;
    	else if(variable.equals("s5mar"))
    		return s5marks;
    	else if(variable.equals("s3mar"))
    		return s3marks;
    	
    	else if(variable.equals("s6mar"))
    		return s6marks;
    	else if(variable.equals("s1s2mar"))
    		return s1s2marks;
    	else if(variable.equals("s7mar"))
    		return s7marks;
    	else if(variable.equals("s8mar"))
    		return s8marks;
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
		else if(name.equals("s3mar"))
			this.s3marks=variable;
		else if(name.equals("s7mar"))
			this.s7marks=variable;
		else if(name.equals("s8mar"))
			this.s8marks=variable;
	}

 


}
