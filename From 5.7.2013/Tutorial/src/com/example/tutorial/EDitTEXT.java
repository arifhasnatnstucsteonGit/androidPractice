package com.example.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class EDitTEXT extends Activity{

	EditText et;
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.editext);
	et=(EditText) findViewById(R.id.editText1);
	b=(Button) findViewById(R.id.button1);
	b.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			et.setText("this is for EditText ");
			
		}});
	
		
	}
	
	

}
