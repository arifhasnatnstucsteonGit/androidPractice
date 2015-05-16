package com.example.androidbrowser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class RP extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.rp);
		TextView tv=(TextView) findViewById(R.id.androidLabl);
		tv.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.androidprogrammingLab.wordpress.com"));
				startActivity(intent);
				
			}
			
		});
	}

	
}
