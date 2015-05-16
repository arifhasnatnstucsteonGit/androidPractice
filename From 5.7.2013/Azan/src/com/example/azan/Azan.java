package com.example.azan;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.Toast;

public class Azan extends Activity implements OnCheckedChangeListener{

	CheckBox fazr,johr,asr,magrib,esha, tahajjot,esrak,awabin,jan,feb,mar,april,may,june,july,aug,sep,oct,nov,dec;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.salah);
		fazr=(CheckBox) findViewById(R.id.checkBox1);
		johr=(CheckBox) findViewById(R.id.checkBox2);
		asr=(CheckBox) findViewById(R.id.checkBox3);
		magrib=(CheckBox) findViewById(R.id.checkBox4);
		esha=(CheckBox) findViewById(R.id.checkBox5);
		
		
		jan=(CheckBox) findViewById(R.id.checkBox6);
		feb=(CheckBox) findViewById(R.id.checkBox7);
		mar=(CheckBox) findViewById(R.id.checkBox8);
		april=(CheckBox) findViewById(R.id.checkBox9);
		may=(CheckBox) findViewById(R.id.checkBox10);
		june=(CheckBox) findViewById(R.id.checkBox11);
		july=(CheckBox) findViewById(R.id.checkBox12);
		aug=(CheckBox) findViewById(R.id.checkBox13);
		sep=(CheckBox) findViewById(R.id.checkBox14);
		oct=(CheckBox) findViewById(R.id.checkBox15);
		nov=(CheckBox) findViewById(R.id.checkBox16);
		dec=(CheckBox) findViewById(R.id.checkBox17);
		
	

		fazr.setOnCheckedChangeListener(this);
		johr.setOnCheckedChangeListener(this);
		magrib.setOnCheckedChangeListener(this);
		asr.setOnCheckedChangeListener(this);
		esha.setOnCheckedChangeListener(this);
	
		
		
		
		
		
		
		jan.setOnCheckedChangeListener(this);
		feb.setOnCheckedChangeListener(this);
		mar.setOnCheckedChangeListener(this);
		april.setOnCheckedChangeListener(this);
		mar.setOnCheckedChangeListener(this);
		may.setOnCheckedChangeListener(this);
		june.setOnCheckedChangeListener(this);
		july.setOnCheckedChangeListener(this);
		aug.setOnCheckedChangeListener(this);
		sep.setOnCheckedChangeListener(this);
		oct.setOnCheckedChangeListener(this);
		nov.setOnCheckedChangeListener(this);
		dec.setOnCheckedChangeListener(this);
		
	}
	
	@Override
	public void onCheckedChanged(CompoundButton b, boolean is) {
		
			
			

		
		
			
				
				if(fazr.isChecked()){
			
					if(jan.isChecked()){

					
					
						Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
						
						Intent intent=new Intent(this,Alarmmanage.class);
						PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
						
						
						Calendar cal=Calendar.getInstance();
						cal.add(Calendar.SECOND,5);
						long cals=cal.getTimeInMillis();
					
						
						AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
						alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
						
					}else if(feb.isChecked()){
						
						
                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
						
						Intent intent=new Intent(this,Alarmmanage.class);
						PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
						
						
						Calendar cal=Calendar.getInstance();
						cal.add(Calendar.SECOND,45);
						long cals=cal.getTimeInMillis();
					
						
						AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
						alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
					}else if(mar.isChecked()){
						
						
	                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
							
							Intent intent=new Intent(this,Alarmmanage.class);
							PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
							
							
							Calendar cal=Calendar.getInstance();
							cal.add(Calendar.SECOND,45);
							long cals=cal.getTimeInMillis();
						
							
							AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
							alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
						}else if(april.isChecked()){
							
							
		                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
								
								Intent intent=new Intent(this,Alarmmanage.class);
								PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
								
								
								Calendar cal=Calendar.getInstance();
								cal.add(Calendar.SECOND,45);
								long cals=cal.getTimeInMillis();
							
								
								AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
								alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
							}else if(may.isChecked()){
								
								
			                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
									
									Intent intent=new Intent(this,Alarmmanage.class);
									PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
									
									
									Calendar cal=Calendar.getInstance();
									cal.add(Calendar.SECOND,45);
									long cals=cal.getTimeInMillis();
								
									
									AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
									alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
								}else if(june.isChecked()){
									
									
				                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
										
										Intent intent=new Intent(this,Alarmmanage.class);
										PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
										
										
										Calendar cal=Calendar.getInstance();
										cal.add(Calendar.SECOND,45);
										long cals=cal.getTimeInMillis();
									
										
										AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
										alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
									}else if(july.isChecked()){
										
										
					                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
											
											Intent intent=new Intent(this,Alarmmanage.class);
											PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
											
											
											Calendar cal=Calendar.getInstance();
											cal.add(Calendar.SECOND,45);
											long cals=cal.getTimeInMillis();
										
											
											AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
											alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
										}else if(aug.isChecked()){
											
											
						                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
												
												Intent intent=new Intent(this,Alarmmanage.class);
												PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
												
												
												Calendar cal=Calendar.getInstance();
												cal.add(Calendar.SECOND,45);
												long cals=cal.getTimeInMillis();
											
												
												AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
												alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
											}else if(sep.isChecked()){
												
												
							                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
													
													Intent intent=new Intent(this,Alarmmanage.class);
													PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
													
													
													Calendar cal=Calendar.getInstance();
													cal.add(Calendar.SECOND,45);
													long cals=cal.getTimeInMillis();
												
													
													AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
													alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
												}else if(oct.isChecked()){
													
													
								                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
														
														Intent intent=new Intent(this,Alarmmanage.class);
														PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
														
														
														Calendar cal=Calendar.getInstance();
														cal.add(Calendar.SECOND,45);
														long cals=cal.getTimeInMillis();
													
														
														AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
														alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
													}else if(nov.isChecked()){
														
														
									                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
															
															Intent intent=new Intent(this,Alarmmanage.class);
															PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
															
															
															Calendar cal=Calendar.getInstance();
															cal.add(Calendar.SECOND,45);
															long cals=cal.getTimeInMillis();
														
															
															AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
															alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
														}else if(dec.isChecked()){
															
															
										                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
																
																Intent intent=new Intent(this,Alarmmanage.class);
																PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
																
																
																Calendar cal=Calendar.getInstance();
																cal.add(Calendar.SECOND,45);
																long cals=cal.getTimeInMillis();
															
																
																AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
																alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
															}else {Toast.makeText(Azan.this, "Select any month", Toast.LENGTH_LONG).show();}
				

					
					
				
					
				
				
			
			
			
			
			
			}else if(johr.isChecked()){
				
				
				if(jan.isChecked()){

					
					
					Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
					
					Intent intent=new Intent(this,Alarmmanage.class);
					PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal=Calendar.getInstance();
					cal.add(Calendar.SECOND,5);
					long cals=cal.getTimeInMillis();
				
					
					AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
					
				}else if(feb.isChecked()){
					
					
                  Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
					
					Intent intent=new Intent(this,Alarmmanage.class);
					PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal=Calendar.getInstance();
					cal.add(Calendar.SECOND,45);
					long cals=cal.getTimeInMillis();
				
					
					AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
				}else if(mar.isChecked()){
					
					
                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
						
						Intent intent=new Intent(this,Alarmmanage.class);
						PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
						
						
						Calendar cal=Calendar.getInstance();
						cal.add(Calendar.SECOND,45);
						long cals=cal.getTimeInMillis();
					
						
						AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
						alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
					}else if(april.isChecked()){
						
						
	                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
							
							Intent intent=new Intent(this,Alarmmanage.class);
							PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
							
							
							Calendar cal=Calendar.getInstance();
							cal.add(Calendar.SECOND,45);
							long cals=cal.getTimeInMillis();
						
							
							AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
							alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
						}else if(may.isChecked()){
							
							
		                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
								
								Intent intent=new Intent(this,Alarmmanage.class);
								PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
								
								
								Calendar cal=Calendar.getInstance();
								cal.add(Calendar.SECOND,45);
								long cals=cal.getTimeInMillis();
							
								
								AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
								alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
							}else if(june.isChecked()){
								
								
			                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
									
									Intent intent=new Intent(this,Alarmmanage.class);
									PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
									
									
									Calendar cal=Calendar.getInstance();
									cal.add(Calendar.SECOND,45);
									long cals=cal.getTimeInMillis();
								
									
									AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
									alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
								}else if(july.isChecked()){
									
									
				                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
										
										Intent intent=new Intent(this,Alarmmanage.class);
										PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
										
										
										Calendar cal=Calendar.getInstance();
										cal.add(Calendar.SECOND,45);
										long cals=cal.getTimeInMillis();
									
										
										AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
										alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
									}else if(aug.isChecked()){
										
										
					                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
											
											Intent intent=new Intent(this,Alarmmanage.class);
											PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
											
											
											Calendar cal=Calendar.getInstance();
											cal.add(Calendar.SECOND,45);
											long cals=cal.getTimeInMillis();
										
											
											AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
											alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
										}else if(sep.isChecked()){
											
											
						                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
												
												Intent intent=new Intent(this,Alarmmanage.class);
												PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
												
												
												Calendar cal=Calendar.getInstance();
												cal.add(Calendar.SECOND,45);
												long cals=cal.getTimeInMillis();
											
												
												AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
												alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
											}else if(oct.isChecked()){
												
												
							                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
													
													Intent intent=new Intent(this,Alarmmanage.class);
													PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
													
													
													Calendar cal=Calendar.getInstance();
													cal.add(Calendar.SECOND,45);
													long cals=cal.getTimeInMillis();
												
													
													AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
													alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
												}else if(nov.isChecked()){
													
													
								                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
														
														Intent intent=new Intent(this,Alarmmanage.class);
														PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
														
														
														Calendar cal=Calendar.getInstance();
														cal.add(Calendar.SECOND,45);
														long cals=cal.getTimeInMillis();
													
														
														AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
														alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
													}else if(dec.isChecked()){
														
														
									                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
															
															Intent intent=new Intent(this,Alarmmanage.class);
															PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
															
															
															Calendar cal=Calendar.getInstance();
															cal.add(Calendar.SECOND,45);
															long cals=cal.getTimeInMillis();
														
															
															AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
															alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
														}else {Toast.makeText(Azan.this, "Select any month", Toast.LENGTH_LONG).show();}
			

				
				
			
				
			
			
				
				
			}else if(asr.isChecked()){
				
				
				if(jan.isChecked()){

					
					
					Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
					
					Intent intent=new Intent(this,Alarmmanage.class);
					PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal=Calendar.getInstance();
					cal.add(Calendar.SECOND,5);
					long cals=cal.getTimeInMillis();
				
					
					AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
					
				}else if(feb.isChecked()){
					
					
                  Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
					
					Intent intent=new Intent(this,Alarmmanage.class);
					PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal=Calendar.getInstance();
					cal.add(Calendar.SECOND,45);
					long cals=cal.getTimeInMillis();
				
					
					AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
				}else if(mar.isChecked()){
					
					
                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
						
						Intent intent=new Intent(this,Alarmmanage.class);
						PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
						
						
						Calendar cal=Calendar.getInstance();
						cal.add(Calendar.SECOND,45);
						long cals=cal.getTimeInMillis();
					
						
						AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
						alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
					}else if(april.isChecked()){
						
						
	                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
							
							Intent intent=new Intent(this,Alarmmanage.class);
							PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
							
							
							Calendar cal=Calendar.getInstance();
							cal.add(Calendar.SECOND,45);
							long cals=cal.getTimeInMillis();
						
							
							AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
							alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
						}else if(may.isChecked()){
							
							
		                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
								
								Intent intent=new Intent(this,Alarmmanage.class);
								PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
								
								
								Calendar cal=Calendar.getInstance();
								cal.add(Calendar.SECOND,45);
								long cals=cal.getTimeInMillis();
							
								
								AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
								alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
							}else if(june.isChecked()){
								
								
			                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
									
									Intent intent=new Intent(this,Alarmmanage.class);
									PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
									
									
									Calendar cal=Calendar.getInstance();
									cal.add(Calendar.SECOND,45);
									long cals=cal.getTimeInMillis();
								
									
									AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
									alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
								}else if(july.isChecked()){
									
									
				                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
										
										Intent intent=new Intent(this,Alarmmanage.class);
										PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
										
										
										Calendar cal=Calendar.getInstance();
										cal.add(Calendar.SECOND,45);
										long cals=cal.getTimeInMillis();
									
										
										AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
										alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
									}else if(aug.isChecked()){
										
										
					                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
											
											Intent intent=new Intent(this,Alarmmanage.class);
											PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
											
											
											Calendar cal=Calendar.getInstance();
											cal.add(Calendar.SECOND,45);
											long cals=cal.getTimeInMillis();
										
											
											AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
											alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
										}else if(sep.isChecked()){
											
											
						                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
												
												Intent intent=new Intent(this,Alarmmanage.class);
												PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
												
												
												Calendar cal=Calendar.getInstance();
												cal.add(Calendar.SECOND,45);
												long cals=cal.getTimeInMillis();
											
												
												AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
												alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
											}else if(oct.isChecked()){
												
												
							                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
													
													Intent intent=new Intent(this,Alarmmanage.class);
													PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
													
													
													Calendar cal=Calendar.getInstance();
													cal.add(Calendar.SECOND,45);
													long cals=cal.getTimeInMillis();
												
													
													AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
													alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
												}else if(nov.isChecked()){
													
													
								                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
														
														Intent intent=new Intent(this,Alarmmanage.class);
														PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
														
														
														Calendar cal=Calendar.getInstance();
														cal.add(Calendar.SECOND,45);
														long cals=cal.getTimeInMillis();
													
														
														AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
														alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
													}else if(dec.isChecked()){
														
														
									                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
															
															Intent intent=new Intent(this,Alarmmanage.class);
															PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
															
															
															Calendar cal=Calendar.getInstance();
															cal.add(Calendar.SECOND,45);
															long cals=cal.getTimeInMillis();
														
															
															AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
															alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
														}else {Toast.makeText(Azan.this, "Select any month", Toast.LENGTH_LONG).show();}
			

				
				
			
				
			
			
				
				
			}else if(magrib.isChecked()){
				
				
				if(jan.isChecked()){

					
					
					Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
					
					Intent intent=new Intent(this,Alarmmanage.class);
					PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal=Calendar.getInstance();
					cal.add(Calendar.SECOND,5);
					long cals=cal.getTimeInMillis();
				
					
					AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
					
				}else if(feb.isChecked()){
					
					
                  Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
					
					Intent intent=new Intent(this,Alarmmanage.class);
					PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal=Calendar.getInstance();
					cal.add(Calendar.SECOND,45);
					long cals=cal.getTimeInMillis();
				
					
					AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
				}else if(mar.isChecked()){
					
					
                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
						
						Intent intent=new Intent(this,Alarmmanage.class);
						PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
						
						
						Calendar cal=Calendar.getInstance();
						cal.add(Calendar.SECOND,45);
						long cals=cal.getTimeInMillis();
					
						
						AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
						alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
					}else if(april.isChecked()){
						
						
	                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
							
							Intent intent=new Intent(this,Alarmmanage.class);
							PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
							
							
							Calendar cal=Calendar.getInstance();
							cal.add(Calendar.SECOND,45);
							long cals=cal.getTimeInMillis();
						
							
							AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
							alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
						}else if(may.isChecked()){
							
							
		                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
								
								Intent intent=new Intent(this,Alarmmanage.class);
								PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
								
								
								Calendar cal=Calendar.getInstance();
								cal.add(Calendar.SECOND,45);
								long cals=cal.getTimeInMillis();
							
								
								AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
								alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
							}else if(june.isChecked()){
								
								
			                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
									
									Intent intent=new Intent(this,Alarmmanage.class);
									PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
									
									
									Calendar cal=Calendar.getInstance();
									cal.add(Calendar.SECOND,45);
									long cals=cal.getTimeInMillis();
								
									
									AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
									alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
								}else if(july.isChecked()){
									
									
				                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
										
										Intent intent=new Intent(this,Alarmmanage.class);
										PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
										
										
										Calendar cal=Calendar.getInstance();
										cal.add(Calendar.SECOND,45);
										long cals=cal.getTimeInMillis();
									
										
										AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
										alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
									}else if(aug.isChecked()){
										
										
					                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
											
											Intent intent=new Intent(this,Alarmmanage.class);
											PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
											
											
											Calendar cal=Calendar.getInstance();
											cal.add(Calendar.SECOND,45);
											long cals=cal.getTimeInMillis();
										
											
											AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
											alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
										}else if(sep.isChecked()){
											
											
						                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
												
												Intent intent=new Intent(this,Alarmmanage.class);
												PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
												
												
												Calendar cal=Calendar.getInstance();
												cal.add(Calendar.SECOND,45);
												long cals=cal.getTimeInMillis();
											
												
												AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
												alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
											}else if(oct.isChecked()){
												
												
							                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
													
													Intent intent=new Intent(this,Alarmmanage.class);
													PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
													
													
													Calendar cal=Calendar.getInstance();
													cal.add(Calendar.SECOND,45);
													long cals=cal.getTimeInMillis();
												
													
													AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
													alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
												}else if(nov.isChecked()){
													
													
								                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
														
														Intent intent=new Intent(this,Alarmmanage.class);
														PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
														
														
														Calendar cal=Calendar.getInstance();
														cal.add(Calendar.SECOND,45);
														long cals=cal.getTimeInMillis();
													
														
														AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
														alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
													}else if(dec.isChecked()){
														
														
									                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
															
															Intent intent=new Intent(this,Alarmmanage.class);
															PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
															
															
															Calendar cal=Calendar.getInstance();
															cal.add(Calendar.SECOND,45);
															long cals=cal.getTimeInMillis();
														
															
															AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
															alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
														}else {Toast.makeText(Azan.this, "Select any month", Toast.LENGTH_LONG).show();}
			

				
				
			
				
			
			
				
				
			}else if(esha.isChecked()){
				
				
				if(jan.isChecked()){

					
					
					Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
					
					Intent intent=new Intent(this,Alarmmanage.class);
					PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal=Calendar.getInstance();
					cal.add(Calendar.SECOND,5);
					long cals=cal.getTimeInMillis();
				
					
					AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
					
				}else if(feb.isChecked()){
					
					
                  Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
					
					Intent intent=new Intent(this,Alarmmanage.class);
					PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
					
					
					Calendar cal=Calendar.getInstance();
					cal.add(Calendar.SECOND,45);
					long cals=cal.getTimeInMillis();
				
					
					AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
					alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
				}else if(mar.isChecked()){
					
					
                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
						
						Intent intent=new Intent(this,Alarmmanage.class);
						PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
						
						
						Calendar cal=Calendar.getInstance();
						cal.add(Calendar.SECOND,45);
						long cals=cal.getTimeInMillis();
					
						
						AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
						alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
					}else if(april.isChecked()){
						
						
	                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
							
							Intent intent=new Intent(this,Alarmmanage.class);
							PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
							
							
							Calendar cal=Calendar.getInstance();
							cal.add(Calendar.SECOND,45);
							long cals=cal.getTimeInMillis();
						
							
							AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
							alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
						}else if(may.isChecked()){
							
							
		                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
								
								Intent intent=new Intent(this,Alarmmanage.class);
								PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
								
								
								Calendar cal=Calendar.getInstance();
								cal.add(Calendar.SECOND,45);
								long cals=cal.getTimeInMillis();
							
								
								AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
								alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
							}else if(june.isChecked()){
								
								
			                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
									
									Intent intent=new Intent(this,Alarmmanage.class);
									PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
									
									
									Calendar cal=Calendar.getInstance();
									cal.add(Calendar.SECOND,45);
									long cals=cal.getTimeInMillis();
								
									
									AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
									alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
								}else if(july.isChecked()){
									
									
				                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
										
										Intent intent=new Intent(this,Alarmmanage.class);
										PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
										
										
										Calendar cal=Calendar.getInstance();
										cal.add(Calendar.SECOND,45);
										long cals=cal.getTimeInMillis();
									
										
										AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
										alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
									}else if(aug.isChecked()){
										
										
					                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
											
											Intent intent=new Intent(this,Alarmmanage.class);
											PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
											
											
											Calendar cal=Calendar.getInstance();
											cal.add(Calendar.SECOND,45);
											long cals=cal.getTimeInMillis();
										
											
											AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
											alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
										}else if(sep.isChecked()){
											
											
						                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
												
												Intent intent=new Intent(this,Alarmmanage.class);
												PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
												
												
												Calendar cal=Calendar.getInstance();
												cal.add(Calendar.SECOND,45);
												long cals=cal.getTimeInMillis();
											
												
												AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
												alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
											}else if(oct.isChecked()){
												
												
							                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
													
													Intent intent=new Intent(this,Alarmmanage.class);
													PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
													
													
													Calendar cal=Calendar.getInstance();
													cal.add(Calendar.SECOND,45);
													long cals=cal.getTimeInMillis();
												
													
													AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
													alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
												}else if(nov.isChecked()){
													
													
								                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
														
														Intent intent=new Intent(this,Alarmmanage.class);
														PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
														
														
														Calendar cal=Calendar.getInstance();
														cal.add(Calendar.SECOND,45);
														long cals=cal.getTimeInMillis();
													
														
														AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
														alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
													}else if(dec.isChecked()){
														
														
									                      Toast.makeText(Azan.this, "it is checked", Toast.LENGTH_LONG).show();
															
															Intent intent=new Intent(this,Alarmmanage.class);
															PendingIntent pendingintent=PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
															
															
															Calendar cal=Calendar.getInstance();
															cal.add(Calendar.SECOND,45);
															long cals=cal.getTimeInMillis();
														
															
															AlarmManager alarm=(AlarmManager) this.getSystemService(this.ALARM_SERVICE);
															alarm.set(AlarmManager.RTC_WAKEUP, cals, pendingintent);
														}else {Toast.makeText(Azan.this, "Select any month", Toast.LENGTH_LONG).show();}
			

				
				
			
				
			
			
				
				
			}else{Toast.makeText(Azan.this, "you can select all of the salah", Toast.LENGTH_LONG).show();}
				
		
		
		
		
		
		


	


   
	}   
}
