package com.example.alarmfreshers;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Intent intent =new Intent(this,alarmTime.class);
		PendingIntent pendingIntent=PendingIntent.getBroadcast(this ,0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
		
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.SECOND,5);
		long cals;
	
	
	
	}

	
	

}
