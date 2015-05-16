package com.example.games;

import android.app.Activity;
import android.os.Bundle;

public class MainFile extends Activity{

	GameView view;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	view=new GameView(this);
	setContentView(view);
	
		
	}

	
	
}
