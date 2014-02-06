package com.example.fizzbuzz;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	TextView fbOut;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		fbOut = (TextView) findViewById(R.id.fizzyOutput);
		fbOut.setMovementMethod(new ScrollingMovementMethod());

		fbOut.setText("This will count up to the number you specify.\n\n"
				+ "For every 3rd number, it will say, \"Fizz.\"\n"
				+ "For every 5th number, it will say, \"Buzz.\"\n"
				+ "For every 15th number, it will say, \"FizzBuzz.\"\n\n"
				+ "Enter a number and hit Go!\n");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		Button btn1 = (Button) findViewById(R.id.button1);
		final EditText etxt1 = (EditText) findViewById(R.id.editText1);
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// Initialize int
				int value = 0;
				
				// Debug toast
				Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
				
				// Convert from Editable to String so parseInt can handle it
				// Remember to catch NumberFormatException parseInt throws
				try {
					value = Integer.parseInt(etxt1.getText().toString());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// Pass value to FizzBuzz
				fbOut.setText(FizzBuzz.fbPrint(value));
			}
		});
		
		return true;
	}

}
