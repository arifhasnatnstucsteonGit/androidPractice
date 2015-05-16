package com.example.notification;



import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ProgressDialoges extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.activity_notification);
		
		Button b=(Button) findViewById(R.id.button1);
		
		            b.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
				
				 ProgressDialog dialog=new ProgressDialog(ProgressDialoges.this);
				
				dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
				dialog.setMessage("Please wait..............");

				dialog.setIndeterminate(true);
		        dialog.setProgress(35);
				dialog.show();
				
			}});
	
	
	
		
	}
	
	

}
