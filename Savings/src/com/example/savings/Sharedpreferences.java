package com.example.savings;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.Menu;
import android.widget.EditText;

public class Sharedpreferences extends Activity {
EditText et;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sharedpreferences);
		et=(EditText) findViewById(R.id.editText2);
		SharedPreferences preferences=getSharedPreferences("arif", 0);
		et.setText(preferences.getString("text", ""));
		et.setTextColor(Color.RED);
		
	}

	
	
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		
		SharedPreferences preferences=getSharedPreferences("arif", 0);
		SharedPreferences.Editor editor=preferences.edit();
		editor.putString("text",et.getText().toString());
		editor.commit();
		
	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sharedpreferences, menu);
		return true;
	}

}
