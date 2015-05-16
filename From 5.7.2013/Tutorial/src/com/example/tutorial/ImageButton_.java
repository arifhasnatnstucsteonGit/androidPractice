package com.example.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class ImageButton_ extends Activity{
ImageButton ib;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.imagebutton);

		ib.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				Toast.makeText(ImageButton_.this,"This is ImmageButton's Text ",Toast.LENGTH_LONG).show();
				
				
			}});
		
		
	}

	
	
}
