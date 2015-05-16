package com.example.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.Toast;

public class Switch_  extends Activity{

	
	Switch sb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.switch_);
		sb=(Switch) findViewById(R.id.switch1);
		sb.setOnCheckedChangeListener(new OnCheckedChangeListener(){

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				
				if(isChecked){
					Toast.makeText(getApplicationContext(), "checked",Toast.LENGTH_LONG).show();
					
				}else{
					Toast.makeText(getApplicationContext(), "Unchecked",Toast.LENGTH_LONG).show();	
				}
				
				
			}});
	}
	
	
	

	
	
}
