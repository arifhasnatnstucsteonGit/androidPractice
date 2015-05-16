package com.example.csteclassnotifyer;

import java.util.Calendar;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity implements OnCheckedChangeListener {
	CheckBox sun,mon,tue,thr,wed,a,b,c,d,e,f,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sun=(CheckBox) findViewById(R.id.checkBox1);
        mon=(CheckBox) findViewById(R.id.checkBox2);
        tue=(CheckBox) findViewById(R.id.checkBox3);
        thr=(CheckBox) findViewById(R.id.checkBox4);
        wed=(CheckBox) findViewById(R.id.checkBox5);
        a=(CheckBox) findViewById(R.id.checkBox6);
        b=(CheckBox) findViewById(R.id.checkBox7);
        c=(CheckBox) findViewById(R.id.checkBox8);
        d=(CheckBox) findViewById(R.id.checkBox9);
        e=(CheckBox) findViewById(R.id.checkBox10);
        f=(CheckBox) findViewById(R.id.checkBox11);
        g=(CheckBox) findViewById(R.id.checkBox12);
        
     
        
        sun.setOnCheckedChangeListener(this);
        mon.setOnCheckedChangeListener(this);
        tue.setOnCheckedChangeListener(this);
        thr.setOnCheckedChangeListener(this);
        wed.setOnCheckedChangeListener(this);
        a.setOnCheckedChangeListener(this);
        b.setOnCheckedChangeListener(this);
        c.setOnCheckedChangeListener(this);
        d.setOnCheckedChangeListener(this);
        e.setOnCheckedChangeListener(this);
        f.setOnCheckedChangeListener(this);
        g.setOnCheckedChangeListener(this);
        //h.setOnCheckedChangeListener(this);
        //sun.setOnCheckedChangeListener(this);
    }


    

	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		

		
		if(sun.isChecked()){
			
			
			Intent intent=new Intent(this,Alarmmanage.class);
			PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
			
			
			Calendar cal=Calendar.getInstance();
		
			cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			cal.set(Calendar.HOUR_OF_DAY, 8);
			cal.set(Calendar.MINUTE, 00);
			cal.set(Calendar.SECOND, 00);
			long cals=cal.getTimeInMillis();
		
			
			AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
			alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
			
			if(a.isChecked()){
				
				Intent intent1=new Intent(this,Alarmmanage.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,9);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				                 
				                 
				
				
				
			}else if(b.isChecked()){
				
				Intent intent1=new Intent(this,Alarmmanage.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,10);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
			}else{
				Toast.makeText(MainActivity.this,"For daily alarm & notification in Class time ;Select all", Toast.LENGTH_LONG).show();
			
			}
			
			
			
			
			
			
			
			
			
			
			
			}else if(mon.isChecked()){
				Intent intent=new Intent(this,Alarmmanagemon.class);
				PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal=Calendar.getInstance();
			
				cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal.set(Calendar.HOUR_OF_DAY, 8);
				cal.set(Calendar.MINUTE, 00);
				cal.set(Calendar.SECOND, 00);
				long cals=cal.getTimeInMillis();
			
				
				AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
				
				
				
				if(b.isChecked()){
					Intent intent1=new Intent(this,Alarmmanagemon.class);
					PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal1=Calendar.getInstance();
				
					cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
					cal1.set(Calendar.HOUR_OF_DAY,10);
					cal1.set(Calendar.MINUTE, 00);
					cal1.set(Calendar.SECOND, 00);
					long cals1=cal1.getTimeInMillis();
				
					
					AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
					
					
					
					
					
					
				}else if(c.isChecked()){
					Intent intent1=new Intent(this,Alarmmanagemon.class);
					PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal1=Calendar.getInstance();
				
					cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
					cal1.set(Calendar.HOUR_OF_DAY,11);
					cal1.set(Calendar.MINUTE, 00);
					cal1.set(Calendar.SECOND, 00);
					long cals1=cal1.getTimeInMillis();
				
					
					AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
					
					
					
				}else{
					Toast.makeText(MainActivity.this,"For daily alarm & notification in Class time ;Select all", Toast.LENGTH_LONG).show();
					
					
				}
				
				
			}
			
			
			
		
		
		
		
		
		
			
			
			
			
		else if(tue.isSelected()){
			Intent intent=new Intent(this,Alarmmanagetue.class);
			PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
			
			
			Calendar cal=Calendar.getInstance();
		
			cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			cal.set(Calendar.HOUR_OF_DAY, 8);
			cal.set(Calendar.MINUTE, 00);
			cal.set(Calendar.SECOND, 00);
			long cals=cal.getTimeInMillis();
		
			
			AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
			alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
			
			if(a.isChecked()){
				Intent intent1=new Intent(this,Alarmmanagetue.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,9);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				
				
				
				
				
			}else if(c.isChecked()){
				Intent intent1=new Intent(this,Alarmmanagetue.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,11);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				
				
			}else if(e.isChecked()){
				Intent intent1=new Intent(this,Alarmmanagetue.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,14);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				
				
			}else if(f.isChecked()){
				Intent intent1=new Intent(this,Alarmmanagetue.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,15);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				
				
			}else if(g.isChecked()){
				Intent intent1=new Intent(this,Alarmmanagetue.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,16);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				
				
			}
			
			
			
			else{
				Toast.makeText(MainActivity.this,"For daily alarm & notification in Class time ;Select all", Toast.LENGTH_LONG).show();
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		else if(wed.isSelected()){
			Intent intent=new Intent(this,Alarmmanagewed.class);
			PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
			
			
			Calendar cal=Calendar.getInstance();
		
			cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			cal.set(Calendar.HOUR_OF_DAY, 8);
			cal.set(Calendar.MINUTE, 00);
			cal.set(Calendar.SECOND, 00);
			long cals=cal.getTimeInMillis();
		
			
			AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
			alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
			
			
			if(b.isChecked()){
				Intent intent1=new Intent(this,Alarmmanagewed.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,10);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				
				
				
				
				
			}else if(d.isChecked()){
				Intent intent1=new Intent(this,Alarmmanagewed.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,12);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				
				
			}else if(e.isChecked()){
				Intent intent1=new Intent(this,Alarmmanagewed.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,14);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				
				
			}
			else{
				Toast.makeText(MainActivity.this,"For daily alarm & notification in Class time ;Select all ", Toast.LENGTH_LONG).show();
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		else if(thr.isSelected()){
			Intent intent=new Intent(this,Alarmmanagethr.class);
			PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
			
			
			Calendar cal=Calendar.getInstance();
		
			cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			cal.set(Calendar.HOUR_OF_DAY, 8);
			cal.set(Calendar.MINUTE, 00);
			cal.set(Calendar.SECOND, 00);
			long cals=cal.getTimeInMillis();
		
			
			AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
			alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
			
			if(a.isChecked()){
				
				Intent intent1=new Intent(this,Alarmmanagethr.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,9);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				
				
				
				
			}else if(c.isChecked()){
				
				Intent intent1=new Intent(this,Alarmmanagethr.class);
				PendingIntent pendingintent1=PendingIntent.getBroadcast(this, 0, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
				
				
				Calendar cal1=Calendar.getInstance();
			
				cal1.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
				cal1.set(Calendar.HOUR_OF_DAY,11);
				cal1.set(Calendar.MINUTE, 00);
				cal1.set(Calendar.SECOND, 00);
				long cals1=cal1.getTimeInMillis();
			
				
				AlarmManager alarm1=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
				alarm1.set(AlarmManager.RTC_WAKEUP, cals1, pendingintent1);
				
				
			}else{Toast.makeText(MainActivity.this, "For daily alarm & notification in Class time ;Select all", Toast.LENGTH_LONG).show();}
			
			
		}
		
		
		
		
		
		else{Toast.makeText(MainActivity.this, "hey man! Select every day for 100% attendance ", Toast.LENGTH_LONG).show();}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }




	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
		case R.id.item1:
			Intent intent =new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com/arif.hasnat3"));
			startActivity(intent);
			break;
		
		case R.id.item2:
			Intent intent1=new Intent(android.content.Intent.ACTION_CALL,Uri.parse("tel:01750539739"));
			startActivity(intent1);
			
			break;
			
		case R.id.item3:
			Intent intent3=new Intent("com.example.csteclassnotifyer.FullSc");
			startActivity(intent3);
			
			
			break;
		
		}
		return true;
	
	
	}
	
	

}
