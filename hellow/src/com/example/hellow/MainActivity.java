package com.example.hellow;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button b;
	EditText et;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b=(Button) findViewById(R.id.button1);
		et=(EditText) findViewById(R.id.editText1);
		tv=(TextView) findViewById(R.id.textView1);
		b.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				String arif=et.getText().toString();
				tv.setText(arif);
				
			}});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
