package com.example.csteclassroutinealarm;

import java.util.Calendar;



import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.widget.Toast;

public class Alarm extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alarm);
		
		
		
	
			
			
			//Calendar cal=Calendar.getInstance();
			//Calendar cals=(Calendar) cal.clone();
			//cals.add(Calendar.SECOND, 5);
			//long cal2=cals.getTimeInMillis();
			
			
		
			
		
			
			//AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
			//alarm1.set(AlarmManager.RTC_WAKEUP, cal2 ,pendingIntent);
			
			switch(Calendar.DAY_OF_WEEK){
			
			case Calendar.TUESDAY:
				
				Intent intent =new Intent(this,tune.class);
				 PendingIntent pendingIntent=PendingIntent.getBroadcast(this ,0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					
				Calendar calendar=Calendar.getInstance();
				Calendar calendar1=(Calendar) calendar.clone();
				calendar1.add(Calendar.SECOND,10);
				long calenders=calendar1.getTimeInMillis();
				
				AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				manager.set(AlarmManager.RTC_WAKEUP,calenders,pendingIntent);
				break;
			case Calendar.FRIDAY:
				break;
				
				
			
			
			
			}
		 
		
			
			
			
			
			
			
			
			
			
			
			

		}
		


	

}
