package com.example.csteclassalarm;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Start extends Activity {
Button eight,nine,ten,eleven,Twelve,forthen,fifthen,sixten;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		
		
		
		eight=(Button) findViewById(R.id.button1);
		nine=(Button) findViewById(R.id.Button02);
		eight.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Context context=Start.this;
				Toast.makeText(context, "Actived your first class 8am - 9am Alarm !", Toast.LENGTH_LONG).show();
				
				
					
				//Calendar cal=Calendar.getInstance();
				//cal.add(Calendar.SECOND,5);
				//cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
				
				
				
				//long cals=cal.getTimeInMillis();
			//SimpleDateFormat dateformat=new SimpleDateFormat("E,Y-M-D ,h:m:s: a ");
			//dateformat.setCalendar(cal);
				
				
				switch(Calendar.DAY_OF_WEEK){
				case Calendar.SUNDAY:
					Intent intent =new Intent(context,classTime.class);
					 PendingIntent pendingIntent=PendingIntent.getBroadcast(context ,0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					Calendar cal=Calendar.getInstance();
					cal.add(Calendar.SECOND,5);
					cal.set(Calendar.HOUR_OF_DAY,8);
					AlarmManager alarm=(AlarmManager) context.getSystemService(context.ALARM_SERVICE);
					alarm.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pendingIntent);
					
			
					break;
				case Calendar.MONDAY:
					Toast.makeText(context,"You have no class today now",Toast.LENGTH_LONG).show();
					
				
								}
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
		});
		
		
		
		nine.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Context context=Start.this;
				Toast.makeText(context, "Actived your first class 8am - 9am Alarm !", Toast.LENGTH_LONG).show();
				Intent intent =new Intent(context,classTime.class);
				 PendingIntent pendingIntent=PendingIntent.getBroadcast(context ,0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					
				Calendar cal=Calendar.getInstance();
				cal.add(Calendar.SECOND,10);
				long cals=cal.getTimeInMillis();
			
				
				AlarmManager alarm=(AlarmManager) context.getSystemService(context.ALARM_SERVICE);
				alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingIntent);
				
				
			}});
		
		
	}


}
