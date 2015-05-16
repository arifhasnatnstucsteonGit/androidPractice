package com.example.cstealarm;

import android.app.AlertDialog;
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

public class notification extends BroadcastReceiver{
private static final int MY_NOTIFICATION_ID = 1;
Notification nt;
NotificationManager nm;

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		String arif="8am-9am:Computer Networking(CSTE 3201) "+
	"\n"+"9am-10am: MicroWave and Sattellite Communication"+"\n"+
				"10am-11am:Web Engineering"+"\n"+
	"11am-12pm:Data Communication"+
			
	"\n"+"12pm-1.00pm:Software Engineering "+
	"\n"+"2pm-3pm:Wireless Communication and Networks"
	+"\n"+"3pm-4pm:Lab and viva";
		Toast.makeText(arg0, arif, 1000000);
	

		
		
		
		
		String conIn="2pm-3pm:Wireless Communication and Networks"
				+"\n"+"3pm-4pm:Lab and viva";
		
		String conse="3pm-4pm:Lab and viva";
		
		
		
	Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse(arif));
	PendingIntent pendinngIntent=PendingIntent.getActivity(arg0, 0, intent, 0);
	nt=  new Notification.Builder(arg0)
    .setContentTitle("Your Class is going on Today")
    .setContentText(arif)
    .setTicker("You have a Notification!!!!")
    .setWhen(System.currentTimeMillis())
    .setContentIntent(pendinngIntent)

    .setContentInfo(conIn)
    .setContentInfo(conse)
    .setDefaults(Notification.DEFAULT_SOUND)
    .setSound(Uri.parse("android.resource://"+arg0.getPackageName()+"/"+R.raw.alarm))
    .setAutoCancel(true)
 
    .setSubText(conIn)
    .setSubText(conse)

    .setStyle(new Notification.BigTextStyle().bigText(arif))
    .setSmallIcon(R.drawable.ic_launcher)
    .build();
	nt.flags|=Notification.FLAG_SHOW_LIGHTS;
	nm=(NotificationManager)arg0.getSystemService(Context.NOTIFICATION_SERVICE);
nm.notify(MY_NOTIFICATION_ID, nt);
	
MediaPlayer mediaPlayer = MediaPlayer.create(arg0,                 R.raw.alarm);
mediaPlayer.start();

	
	}
}
