package com.example.alarm_with_text;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore.Audio;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

public class Alarmmanage extends BroadcastReceiver{
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
    .setContentText("http://androidprogramminglab.wordpress.com")
    .setTicker("You have a Notification!!!!")
    .setWhen(System.currentTimeMillis())
    .setContentIntent(pendinngIntent)
    .setContentInfo(arif)
    .setDefaults(Notification.DEFAULT_SOUND)
    .setSound(Uri.parse("android.resource://"+arg0.getPackageName()+"/"+R.raw.rain))
    .setAutoCancel(true)
    .setSmallIcon(R.drawable.ic_launcher)
    .build();
	nm=(NotificationManager)arg0.getSystemService(Context.NOTIFICATION_SERVICE);
nm.notify(MY_NOTIFICATION_ID, nt);
	
MediaPlayer mediaPlayer = MediaPlayer.create(arg0,                 R.raw.rain);
mediaPlayer.start();

	
	}

}
