package com.example.sound;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class SoundPool extends Activity implements OnClickListener {

	int music=0;
	SoundPool sound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	   View v=new View(this);
	   setContentView(v);
	   v.setOnClickListener(this);
	
	   sound=new SoundPool();
	   music=sound.load(this,R.raw.gun , 1);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		if(music!=0)
		sound.play(music,1,1, 0, 0, 1);
	}

	
	
	
}
