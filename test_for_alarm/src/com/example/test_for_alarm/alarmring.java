package com.example.test_for_alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class alarmring extends BroadcastReceiver{
	
	
	

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		
		Toast.makeText(arg0, "Your Class is going on!!!! ", 1000).show();
		MediaPlayer mp=MediaPlayer.create(arg0, R.raw.alarm);
				mp.start();
		
	}
	

}
