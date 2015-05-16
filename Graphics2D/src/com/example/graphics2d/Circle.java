package com.example.graphics2d;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Circle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new Circle2D(this));
		
	}

	

}
