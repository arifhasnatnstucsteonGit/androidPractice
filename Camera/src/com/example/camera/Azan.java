package com.example.camera;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class Azan extends Activity implements OnCheckedChangeListener{

	CheckBox fazr,johr,asr,magrib,esha, tahajjot,esrak,awabin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.relative);
		fazr=(CheckBox) findViewById(R.id.checkBox1);
		johr=(CheckBox) findViewById(R.id.checkBox2);
		asr=(CheckBox) findViewById(R.id.checkBox3);
		magrib=(CheckBox) findViewById(R.id.checkBox4);
		esha=(CheckBox) findViewById(R.id.checkBox5);
		tahajjot=(CheckBox) findViewById(R.id.checkBox6);
		esrak=(CheckBox) findViewById(R.id.checkBox7);
		awabin=(CheckBox) findViewById(R.id.checkBox8);
		
		fazr.setOnCheckedChangeListener(this);
		johr.setOnCheckedChangeListener(this);
		magrib.setOnCheckedChangeListener(this);
		asr.setOnCheckedChangeListener(this);
		esha.setOnCheckedChangeListener(this);
		tahajjot.setOnCheckedChangeListener(this);
		esrak.setOnCheckedChangeListener(this);
		awabin.setOnCheckedChangeListener(this);
		
	}
	@Override
	public void onCheckedChanged(CompoundButton b, boolean is) {
		
			
			
			
				
				
			
			//switch(b.getId()){ 
			
			
			
			//case R.id.checkBox1:
				
				if(fazr.isChecked()){
					//Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
					

					Intent intent=new Intent(this,Alarmmanage.class);
					PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal=Calendar.getInstance();
					cal.add(Calendar.SECOND,5);
					long cals=cal.getTimeInMillis();
				
					
					AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
					
					
					
				
					
				
				//}
			
			
			
			
			
			}
			
			}
				
		
		
		
		
		
		


	
}
