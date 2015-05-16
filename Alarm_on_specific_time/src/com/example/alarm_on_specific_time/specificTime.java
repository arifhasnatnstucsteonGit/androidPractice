package com.example.alarm_on_specific_time;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class specificTime extends BroadcastReceiver{

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Toast.makeText(arg0, "Your Class is going on!!!! ", Toast.LENGTH_LONG).show();
		MediaPlayer mp=MediaPlayer.create(arg0, R.raw.rain);
		mp.start();
		
	}

}
