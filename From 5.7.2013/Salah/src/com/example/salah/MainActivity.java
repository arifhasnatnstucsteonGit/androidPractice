package com.example.salah;

import java.util.Calendar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.Toast;

public  class MainActivity extends Activity implements OnItemSelectedListener, OnCheckedChangeListener {
String month[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
String dic[]={"DHAKA","RAJSHAHI","CHITTAGONG","KHULNA","BARISHAL","SYLET","RANGPUR"};
CheckBox fazr,johr,asr,magrib,esha;
Spinner dict;
Spinner mon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fazr=(CheckBox) findViewById(R.id.checkBox1);
        johr=(CheckBox) findViewById(R.id.checkBox2);
        asr=(CheckBox) findViewById(R.id.checkBox3);
        magrib=(CheckBox) findViewById(R.id.checkBox4);
        esha=(CheckBox) findViewById(R.id.checkBox5);
        fazr.setOnCheckedChangeListener(this);
        johr.setOnCheckedChangeListener(this);
        asr.setOnCheckedChangeListener(this);
        magrib.setOnCheckedChangeListener(this);
        esha.setOnCheckedChangeListener(this);
        
        
        
        
        
        
        dict=(Spinner) findViewById(R.id.spinner1);
        mon=(Spinner) findViewById(R.id.spinner2);
        
        ArrayAdapter<String> adater=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,dic);
        dict.setAdapter(adater);
        
        ArrayAdapter<String> adater1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,month);
        mon.setAdapter(adater1);
        
        dict.setOnItemSelectedListener(this);
        mon.setOnItemSelectedListener(this);
        
        
        
        
    }



	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		
		
		switch(dict.getSelectedItemPosition()){
		
		case 0:
			
			
			  switch(mon.getSelectedItemPosition()){
			  //--------------------------------jan-------------------------------------------------------------------------
			  case 0:
				  if(fazr.isChecked()){
					  MediaPlayer mp=MediaPlayer.create(MainActivity.this, R.raw.water);
					  mp.start();
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,6);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  
					  MediaPlayer mp=MediaPlayer.create(MainActivity.this, R.raw.water);
					  mp.start();
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  MediaPlayer mp=MediaPlayer.create(MainActivity.this, R.raw.water);
				      mp.start();
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,15);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  MediaPlayer mp=MediaPlayer.create(MainActivity.this, R.raw.water);
					  mp.start();
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,17);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  MediaPlayer mp=MediaPlayer.create(MainActivity.this, R.raw.water);
					  mp.start();
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,15);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------feb------------------------------------------------------------
				
			  case 1:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,5);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,35);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,18);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------march-----------------------------------------------------------
				
			  case 2:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,5);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,40);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,35);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,18);
					  cal.set(Calendar.MINUTE,18);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,45);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------april-----------------------------------------------------------
			  case 3:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,5);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,15);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,40);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,17);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------may------------------------------------------------------------
			  case 4:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,6);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,17);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------june------------------------------------------------------------
			  case 5:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,6);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,17);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------july------------------------------------------------------------
			  case 6:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,6);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,17);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------august------------------------------------------------------------
			  case 7:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,6);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,17);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------septembor------------------------------------------------------------
			  case 8:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,6);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,17);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------septembar------------------------------------------------------------
			  case 9:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,6);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,17);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//-----------------------------------------oct-----------------------------------------------------------
			  case 10:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,6);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,17);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------nov------------------------------------------------------------
			  case 11:
				  if(fazr.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,fazrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,6);
					  cal.set(Calendar.MINUTE,00);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
					  
					  
				  }else if(johr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,johorAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,12);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(asr.isChecked()){
					  Intent intent =new Intent(MainActivity.this,asrAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,16);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else if(magrib.isChecked()){
					  
					  Intent intent =new Intent(MainActivity.this,magribAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,17);
					  cal.set(Calendar.MINUTE,50);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
				  }else if(esha.isChecked()){
					  Intent intent =new Intent(MainActivity.this,eshaAlarm.class);
					  PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this, 0, intent,PendingIntent.FLAG_CANCEL_CURRENT);
					  
					  
					  Calendar cal=Calendar.getInstance();
					  cal.set(Calendar.HOUR_OF_DAY,19);
					  cal.set(Calendar.MINUTE,30);
					  cal.set(Calendar.SECOND, 00);
					  
					  long cals=cal.getTimeInMillis();
					  
					  AlarmManager manager=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					  manager.set(AlarmManager.RTC_WAKEUP,cals, pendingIntent);
					  
				  }else{
					  Toast.makeText(MainActivity.this,"Please Select ",Toast.LENGTH_LONG).show();
					  
				  }
				  
				  
				break;
				
				
				//------------------------------------------dec------------------------------------------------------------
				

			  }
			  
		case 1://---------------------------------------Rajshahi-----------------------------------------
			
				break;
		case 2://---------------------------------------khulna-----------------------------------------
			break;
		case 3://---------------------------------------Sylet-----------------------------------------
			break;
		case 4://---------------------------------------Barishal-----------------------------------------
			break;
			
		case 5://--------------------------------------- chittagong-----------------------------------------
			
			break;
		case 6://---------------------------------------Rangpur-----------------------------------------
			break;
		
		}
		
	}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }























































	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}



	
    
}
