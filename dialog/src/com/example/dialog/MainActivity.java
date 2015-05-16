package com.example.dialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AlertDialog dialog=new AlertDialog.Builder(this).create();
		dialog.setButton(DialogInterface.BUTTON_POSITIVE,"Go Back",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				
				
			}
		});
		
dialog.setButton(DialogInterface.BUTTON_NEGATIVE,"Go ahead",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				
				
			}
		});
dialog.setButton(DialogInterface.BUTTON_NEUTRAL,"Go ---------------",new DialogInterface.OnClickListener() {
	
	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		
		
	}
});

		
	}

	

}
