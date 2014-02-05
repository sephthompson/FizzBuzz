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

		fbOut.setText("Go!\n");

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
				int value = 0;
				// Just the toast.
				Toast.makeText(MainActivity.this, "Button Clicked!", Toast.LENGTH_SHORT).show();
				
				// Convert from Editable to String so parseInt can handle it
				value = Integer.parseInt(etxt1.getText().toString());
				
				// Pass value to FizzBuzz
				fbOut.setText(FizzBuzz.fbPrint(value));
			}
		});
		
		return true;
	}

}
