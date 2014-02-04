package com.example.fizzbuzz;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView fbOut;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		fbOut = (TextView) findViewById(R.id.fizzyOutput);
		fbOut.setMovementMethod(new ScrollingMovementMethod());
		
		fbOut.setText("Go!\n");
		
		/* ASSUMES INTRA-CLASS METHOD IS DEFINED.
		 * fbOut.setText(fizzBuzzCal());
		 */
		
		fbOut.append(FizzBuzz.fbPrint());
		
		/*
		 * This is if you wanted to include the business logic within the OnCreate method itself.
		 * 
		for (int i = 1; i <= 99; i++) {
			if (i % 15 == 0) {
				fbOut.append("FizzBuzz\n");
			} else if (i % 3 == 0) {
				fbOut.append("Fizz\n");
			} else if (i % 5 == 0) {
				fbOut.append("Buzz\n");
			} else
				// Remember that i is an int, so we must pass its value as a String.
				fbOut.append(String.valueOf(i) + "\n");
		}
		*/
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/*
	 * This is if you wanted to include the business logic within the same class as a method.
	 * Note 
	 * 
	public static String fizzBuzzCalc() {
		
		String y;
		
		for (int i = 0; i < 16; i++) {
			if (i % 15 == 0) {
				return "FizzBuzz\n";
			} else if (i % 3 == 0) {
				return "Fizz\n";
			} else if (i % 5 == 0) {
				return "Buzz\n";
			} else
				// Remember that i is an int, so we must pass its value as a String.
				y = Integer.toString(i);
				return y + "\n";
		}
		return null;
	}
	*/

}
