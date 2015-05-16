package com.example.sqlitedatabase;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Database extends Activity {
Button insert,update,delete,show;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atabase);
		insert=(Button) findViewById(R.id.button1);
		update=(Button) findViewById(R.id.button2);
		delete=(Button) findViewById(R.id.button3);
		show=(Button) findViewById(R.id.button4);
		
		insert.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}});
	}

	
}
