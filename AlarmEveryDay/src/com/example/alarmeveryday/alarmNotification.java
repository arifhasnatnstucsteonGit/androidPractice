package com.example.alarmeveryday;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

public class alarmNotification extends BroadcastReceiver{
private static final int MY_NOTIFICATION_ID = 1;
Notification nt;
NotificationManager nm;

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		String arif="arif hasnat";
		Toast.makeText(arg0, arif, Toast.LENGTH_LONG).show();
	

		
	Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse(arif));
	PendingIntent pendinngIntent=PendingIntent.getActivity(arg0, 0, intent, 0);
	nt=  new NotificationCompat.Builder(arg0)
    .setContentTitle("hellow boss you have a class now ")
    .setContentText(" 8am-9am------Computer Networking .\n 9am-10am-----MicroWave and Satellite Communication '\n' 10am-11am------WebEngineering")
  
    .setContentText("9am-10am-----MicroWave and Satellite Communication '\n' ")
    .setContentText("9am-10am-----MicroWave and Satellite Communication '\n' ")
    .setContentText("9am-10am-----MicroWave and Satellite Communication '\n' ")
    .setContentText("9am-10am-----MicroWave and Satellite Communication '\n' ")
    .setContentText("9am-10am-----MicroWave and Satellite Communication '\n' ")
    .setContentText("9am-10am-----MicroWave and Satellite Communication '\n' ")
    .setTicker("You have a Notification!!!!")
    .setWhen(System.currentTimeMillis())
    .setContentIntent(pendinngIntent)
    .setContentInfo(arif)
    .setDefaults(Notification.DEFAULT_SOUND)
   
    .setAutoCancel(true)
    .setSmallIcon(R.drawable.ic_launcher)
    .build();
	nm=(NotificationManager)arg0.getSystemService(Context.NOTIFICATION_SERVICE);
nm.notify(MY_NOTIFICATION_ID, nt);
	
MediaPlayer mediaPlayer = MediaPlayer.create(arg0,                 R.raw.alarm);
mediaPlayer.start();

	
	}

}
