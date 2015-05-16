package com.example.graphics2d;

import android.app.Activity;
import android.graphics.Shader.TileMode;
import android.os.Bundle;

public class LinearGradient extends Activity{

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(new LinearGrad(this));
		
		
	}
	
	

}
