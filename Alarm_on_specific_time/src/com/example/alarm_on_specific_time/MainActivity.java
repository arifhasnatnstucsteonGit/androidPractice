package com.example.alarm_on_specific_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent intent=new Intent(this, specificTime.class);
		PendingIntent pendingIntent=PendingIntent.getBroadcast(this,0 ,intent, PendingIntent.FLAG_CANCEL_CURRENT);
		
		
		
		Calendar cal=Calendar.getInstance();
		Calendar cal0=(Calendar) cal.clone();
		Calendar cal1=(Calendar) cal.clone();
		
		cal.add(Calendar.SECOND, 5);
		long cals=cal.getTimeInMillis();
		


		
		AlarmManager alarmManager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
	
		alarmManager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
		
	}

	

}
