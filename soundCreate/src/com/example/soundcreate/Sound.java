package com.example.soundcreate;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class Sound extends Activity implements OnClickListener {

	int music=0;
	SoundPool sound;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	   View v=new View(this);
	   setContentView(v);
	   v.setOnClickListener(this);
	
	   sound=new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
	   music=sound.load(this,R.raw.gun , 1);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		if(music!=0)
		sound.play(music,1,1, 0, 0, 1);
	}

	
	
	
}
