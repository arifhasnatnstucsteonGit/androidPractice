package com.example.cstealarm;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AlarmSet extends Activity {
	Button sun,mon,thes,wed,thrus;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alarm_set);
		
		sun=(Button) findViewById(R.id.sun);
		mon=(Button) findViewById(R.id.mon);
		thes=(Button) findViewById(R.id.thes);
		wed=(Button) findViewById(R.id.wed);
		thrus=(Button) findViewById(R.id.thrusday);
		
		
		
		
		
		
		
		
		
		
		
		
		
		sun.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Context context=AlarmSet.this;
				Toast.makeText(context, "alarm activated ! You will get notification with alarm on SunDay at 8am", Toast.LENGTH_LONG).show();
				Intent intent =new Intent(context,notification.class);
				 PendingIntent pendingIntent=PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
				Calendar cal=Calendar.getInstance();
				cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
				cal.set(Calendar.HOUR_OF_DAY, 8);
				cal.set(Calendar.MINUTE, 0);
				cal.set(Calendar.SECOND, 00);
				
			 
			    long cals=cal.getTimeInMillis();
				AlarmManager alarm=(AlarmManager) context.getSystemService(context.ALARM_SERVICE);
				alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingIntent);
				
		
				
				
				
				
			}});
		mon.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Context context=AlarmSet.this;
				Toast.makeText(context, "alarm activated ! You will get notification with alarm on MonDay at 8am", Toast.LENGTH_LONG).show();
				Intent intent =new Intent(context,notificationMonday.class);
				 PendingIntent pendingIntent=PendingIntent.getBroadcast(context ,0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
				Calendar cal=Calendar.getInstance();
				cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
				cal.set(Calendar.HOUR_OF_DAY, 8);
				cal.set(Calendar.MINUTE, 0);
				cal.set(Calendar.SECOND, 00);
				AlarmManager alarm=(AlarmManager) context.getSystemService(context.ALARM_SERVICE);
				alarm.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pendingIntent);
				
		
				
				
				
				
			}});
		thes.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Context context=AlarmSet.this;
				Toast.makeText(context, "alarm activated ! You will get notification with alarm on TuesDay at 8am", Toast.LENGTH_LONG).show();
				Intent intent =new Intent(context,notificationtuesday.class);
				 PendingIntent pendingIntent=PendingIntent.getBroadcast(context ,0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
				Calendar cal=Calendar.getInstance();
				cal.set(Calendar.DAY_OF_WEEK,Calendar.TUESDAY);
				cal.set(Calendar.HOUR_OF_DAY, 8);
				cal.set(Calendar.MINUTE, 0);
				cal.set(Calendar.SECOND, 00);
				AlarmManager alarm=(AlarmManager) context.getSystemService(context.ALARM_SERVICE);
				alarm.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pendingIntent);
				
		
				
				
				
				
			}});
		wed.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Context context=AlarmSet.this;
				Toast.makeText(context, "alarm activated ! You will get notification with alarm on WednesDay at 8am", Toast.LENGTH_LONG).show();
				Intent intent =new Intent(context,notificationWednesDay.class);
				 PendingIntent pendingIntent=PendingIntent.getBroadcast(context ,0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
				Calendar cal=Calendar.getInstance();
				cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
				cal.set(Calendar.HOUR_OF_DAY, 8);
				cal.set(Calendar.MINUTE, 0);
				cal.set(Calendar.SECOND, 00);
				AlarmManager alarm=(AlarmManager) context.getSystemService(context.ALARM_SERVICE);
				alarm.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pendingIntent);
				
		
				
				
				
				
			}});
		thrus.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Context context=AlarmSet.this;
				Toast.makeText(context, "alarm activated ! You will get notification with alarm on ThursDay at 8am", Toast.LENGTH_LONG).show();
				
				Intent intent =new Intent(context,notificationThrusDay.class);
				 PendingIntent pendingIntent=PendingIntent.getService(context ,0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
				Calendar cal=Calendar.getInstance();
				cal.set(Calendar.DAY_OF_WEEK,Calendar.THURSDAY);
				cal.set(Calendar.HOUR_OF_DAY, 8);
				cal.set(Calendar.MINUTE, 0);
				cal.set(Calendar.SECOND, 00);
				AlarmManager alarm=(AlarmManager) context.getSystemService(context.ALARM_SERVICE);
				alarm.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pendingIntent);
				
		
				
				
				
				
			}});
		
	}


}
