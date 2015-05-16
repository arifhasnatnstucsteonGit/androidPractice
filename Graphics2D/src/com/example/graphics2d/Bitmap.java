package com.example.graphics2d;

import android.app.Activity;
import android.os.Bundle;

public class Bitmap extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	setContentView(new BitmapImage(this));
	
	
	}

	
	
	
}
