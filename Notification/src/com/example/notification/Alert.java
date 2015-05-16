package com.example.notification;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

public class Alert extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		
	
		AlertDialog.Builder build=new AlertDialog.Builder(this);
		build.setIcon(R.drawable.ic_launcher);
		build.setMessage("Where u want to go");
		build.setCancelable(false);
	
		build.setPositiveButton("Notification", new OnClickListener(){

			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				
				Intent intent =new Intent("com.example.notification.notification");
				startActivity(intent);
				
			}});
		
		
		build.setNegativeButton("Main menu",new  DialogInterface.OnClickListener(){

			@Override
			public void onClick(DialogInterface arg0, int arg1) {
			
				Alert.this.finish();
			}});
		
		
		
		build.setNeutralButton("EXIT", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				arg0.cancel();
				
			}
		});
		
		AlertDialog alert=build.create();
		alert.show();
		
	
	}

	
}
