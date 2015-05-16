package com.example.test_for_alarm;

import java.util.Calendar;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button b=(Button) findViewById(R.id.button1);
		
		b.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				
			}});
		Intent intent =new Intent(this,alarmring.class);
		PendingIntent pendingIntent=PendingIntent.getBroadcast(this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
		
		switch(Calendar.DAY_OF_WEEK){
			case Calendar.SUNDAY:
				Calendar cal=Calendar.getInstance();
				int a=Calendar.HOUR_OF_DAY;
				if(a==8){
					Toast.makeText(this,"alarm is going on!!!",Toast.LENGTH_LONG).show();
					
					AlarmManager alarm=(AlarmManager)this.getSystemService(Context.ALARM_SERVICE);
					alarm.setRepeating(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis() ,3600*1000, pendingIntent);
					
					
					
					
				}
			break;
			
			
		
			case Calendar.MONDAY:
				Toast.makeText(this,"Today is hollyday for you. Enjoy!!!!",Toast.LENGTH_LONG).show();
				break;
				
			case Calendar.TUESDAY:
				Toast.makeText(this,"Today is hollyday for you. Enjoy!!!!",Toast.LENGTH_LONG).show();
				
				break;
			case Calendar.WEDNESDAY:
				Toast.makeText(this,"Today is hollyday for you. Enjoy!!!!",Toast.LENGTH_LONG).show();
				break;
				
			case Calendar.THURSDAY:
				Toast.makeText(this,"Today is hollyday for you. Enjoy!!!!",Toast.LENGTH_LONG).show();
				Calendar cals=Calendar.getInstance();
				cals.add(Calendar.SECOND, 5);


				AlarmManager alarm=(AlarmManager)this.getSystemService(Context.ALARM_SERVICE);
				alarm.setRepeating(AlarmManager.RTC_WAKEUP,cals.getTimeInMillis() ,36*1000, pendingIntent);
				
				break;
				
			
			case Calendar.FRIDAY:
				 Toast.makeText(this,"Today is hollyday for you. Enjoy!!!!",Toast.LENGTH_LONG).show();
				 break;
		}
		
		
	}

	
}
