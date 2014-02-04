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

		fbOut.append(FizzBuzz.fbPrint());

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
