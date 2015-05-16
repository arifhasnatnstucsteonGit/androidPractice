package com.example.notification;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class notifying extends Activity{
Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification);
	
	 String arif="arif hasnat";
	 
	
	
	
	//.setStyle(new Notification.BigTextStyle().bigText(arif)).build();
	
	
	b=(Button) findViewById(R.id.button1);

	b.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Toast.makeText(notifying.this,"This is some text",Toast.LENGTH_LONG+50000).show();
			
		}});
	
	}
	
	

}
