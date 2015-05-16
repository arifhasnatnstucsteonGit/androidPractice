package com.example.testproject;

import android.app.Activity;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class notify extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		Button button=(Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}});
	}
	
	
	public void create(View view){
		
		String arif="arif";
		//Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse(arif));
		
		Intent intent =new Intent(notify.this,MainActivity.class);
		PendingIntent pendingIntent=PendingIntent.getActivity(this,0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
		
		Notification notifying=new Notification.Builder(this).setContentInfo("hellow!!")
				.setContentTitle("this is for test")
		        .setContentText("http://androidprogramming.wordpress.com")
				.setStyle(new Notification.BigTextStyle().bigText(arif)).setContentIntent(pendingIntent)
				.setContentIntent(pendingIntent)
			    .addAction(R.drawable.ic_launcher, "Notification",pendingIntent)
				.build();
		
		NotificationManager noti=(NotificationManager) this.getSystemService(this.NOTIFICATION_SERVICE);
		notifying.flags|=Notification.FLAG_AUTO_CANCEL;
		noti.notify(0, notifying);
		
		
		
	}
	
	

}
