package com.example.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.SearchView;
import android.widget.Toast;

public class SearchView_ extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchview);
		SearchView sv=(SearchView) findViewById(R.id.searchView1);
		sv.setOnFocusChangeListener(new OnFocusChangeListener(){

			@Override
			public void onFocusChange(View arg0, boolean arg1) {
				
				if(arg0.isFocused()){
					
					Toast.makeText(getApplicationContext(), "found", Toast.LENGTH_LONG).show();
					
					
					
					
					
				}
				
			}});
		
		
		
	}

	
}
