package com.example.csteclassnotifyer;

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

public class Alarmmanage extends BroadcastReceiver{
private static final int MY_NOTIFICATION_ID = 1;
Notification nt;
NotificationManager nm;

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		String arif="sun:8-9AM:Web Eng(CSTE-3205)-NI"+"\n"+"9-10AM:Wireless Communication(CSTE-3211)-AC"+"\n"+"10am-11am"+""+"SE (CSTE-3209)-AC";
		Toast.makeText(arg0, arif, Toast.LENGTH_LONG).show();
	

		
	Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse(arif));
	PendingIntent pendinngIntent=PendingIntent.getActivity(arg0, 0, intent, 0);
	nt=  new Notification.Builder(arg0)
    .setContentTitle("hey boss! your Class Schedule of this day ")
    .setContentText("http://androidprogramminglab.wordpress.com")
    .setTicker("Your Class is going on!!!!")
    .setWhen(System.currentTimeMillis())
    .setContentIntent(pendinngIntent)
    .setContentInfo(arif)
    .setDefaults(Notification.DEFAULT_SOUND)
    //.setSound(Uri.parse("android.resource://"+arg0.getPackageName()+"/"+R.raw.rain))
    .setAutoCancel(true)
    .setStyle(new Notification.BigTextStyle().bigText(arif))
    .setSmallIcon(R.drawable.ic_launcher)
    .build();
	nm=(NotificationManager)arg0.getSystemService(Context.NOTIFICATION_SERVICE);
nm.notify(MY_NOTIFICATION_ID, nt);
	
MediaPlayer mediaPlayer = MediaPlayer.create(arg0, R.raw.alarm);
mediaPlayer.start();

	
	}

}
