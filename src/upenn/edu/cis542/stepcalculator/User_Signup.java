package upenn.edu.cis542.stepcalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class User_Signup extends Activity {
	
		 @Override 
		    public void onCreate(Bundle savedInstanceState) { 
				super.onCreate(savedInstanceState); 
			    setContentView(R.layout.user_signup);
		 }
		public void goBack(View view){
			 Intent signUpIntent = new Intent();  
			 signUpIntent.setClass(this, User_Signin.class );
		     startActivity(signUpIntent);
		}
	


}
