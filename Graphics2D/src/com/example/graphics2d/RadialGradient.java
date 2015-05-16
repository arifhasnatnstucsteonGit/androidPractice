package com.example.graphics2d;
import android.app.Activity;
import android.os.Bundle;

public class RadialGradient extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(new radial(this));
		
	}
	
	

}
