package com.example.show;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

public class MainActivity extends Activity implements OnClickListener,
		OnLongClickListener {

	MediaPlayer mp;
	int music = 0;
	SoundPool sound;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		View v = new View(this);

		v.setOnClickListener(this);
		v.setOnLongClickListener(this);
		setContentView(v);

		sound = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
		music = sound.load(this, R.raw.gun, 1);

		mp = MediaPlayer.create(this, R.raw.background);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

		if (music != 0)
			sound.play(music, 1, 1, 0, 0, 1);
	}

	@Override
	public boolean onLongClick(View arg0) {
		// TODO Auto-generated method stub

		mp.start();
		return false;
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();

		mp.release();

	}

}
