package com.example.gfx;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GFX extends Activity {

	AndroidProgrammingLab lab;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		lab=new AndroidProgrammingLab(this);
		
		setContentView(lab);
		
		
		
	}


}
