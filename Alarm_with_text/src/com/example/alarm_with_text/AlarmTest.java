package com.example.alarm_with_text;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;

public class AlarmTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alarm_test);

	
		
		Intent intent=new Intent(this,Alarmmanage.class);
		PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
		
		
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.SECOND,5);
		long cals=cal.getTimeInMillis();
	
		
		AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
		alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
		
		
		
	
		
		
	}



}
