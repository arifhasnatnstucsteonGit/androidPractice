package com.example.csteclassroutinealarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class tune extends BroadcastReceiver{
	
	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		
		Toast.makeText(arg0, "Your Class is going on!!!! ", Toast.LENGTH_LONG).show();
		MediaPlayer mp=MediaPlayer.create(arg0, R.raw.alarm);
		mp.start();
		
	}
			
	

}
