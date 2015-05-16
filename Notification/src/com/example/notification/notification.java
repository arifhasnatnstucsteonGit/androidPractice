package com.example.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class notification extends Activity{
private static final int notify_quewe=1*1001;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification);
		Button b=(Button) findViewById(R.id.button1);
				b.setOnClickListener(new OnClickListener(){

					@Override
					public void onClick(View arg0) {
						
						Context context=notification.this;
						Intent intent =new Intent(context,notification.class);
						PendingIntent pendingIntent=PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
						
						
						NotificationManager manager=(NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
						Notification notification=new Notification.Builder(context)
						.setContentText("This for test file ")
						.setContentTitle("Boss!!! You have a message !")
						.setAutoCancel(true)
						.setDeleteIntent(pendingIntent)
						.setSubText("this is for You")
						.setSound(Uri.parse("android.resource://com.example.notification"+R.raw.alarm))
						.setWhen(System.currentTimeMillis())
						.setSmallIcon(R.drawable.ic_launcher)
						.setFullScreenIntent(pendingIntent, true)
						.setDefaults(1)
						.setOngoing(true)
						.setOnlyAlertOnce(false)
						.setTicker("Your class is going on!")
						.setUsesChronometer(true)
				
						
						
						
						.build();
						

						notification.flags|=Notification.FLAG_SHOW_LIGHTS;
						notification.ledARGB=Color.BLUE;
						notification.ledOnMS=1000;
						notification.ledOffMS=1000;

						notification.audioStreamType=AudioManager.STREAM_NOTIFICATION;
						notification.sound=Uri.parse("android.resource://com.example.notification"+R.raw.alarm);
						manager.notify(notify_quewe, notification);
						
					
					
					}});
		
	}



	
	
	
	
	
	
	
	
	

}
