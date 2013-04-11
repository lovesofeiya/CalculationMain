package upenn.edu.cis542.stepcalculator;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;


public class User_Signin extends Activity {
	 @Override 
	    public void onCreate(Bundle savedInstanceState) { 
			super.onCreate(savedInstanceState); 
		    setContentView(R.layout.user_signin);
	 }
	 public void signUp(View view){
		 Intent signUpIntent = new Intent();  
		 signUpIntent.setClass(this, User_Signup.class );
	     startActivity(signUpIntent);
		 
	 }
	 public void signIn(View view){
		 Intent mainIntent = new Intent();  
		 mainIntent.setClass(this, CalculationMain.class );
	     startActivity(mainIntent);
		 
	 }


}
