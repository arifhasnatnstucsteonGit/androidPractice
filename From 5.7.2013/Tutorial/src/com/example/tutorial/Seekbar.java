package com.example.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class Seekbar extends Activity{

	TextView tv;
	SeekBar sb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seekbar);
		tv=(TextView) findViewById(R.id.textView1);
		sb=(SeekBar) findViewById(R.id.seekBar1);
		sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){

			int progress;
			@Override
			public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
				tv.setText("calculating");
				progress=arg1;
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				tv.setText("Starting");
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				tv.setText("progess is : "+progress+"%");
				
				Toast.makeText(Seekbar.this, "Progress is"+progress+"%", Toast.LENGTH_LONG).show();
				
			}});
	}

	
}

