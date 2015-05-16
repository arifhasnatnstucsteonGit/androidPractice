package com.example.browser;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;

public class HomePage extends Activity{

	EditText et;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	
		setContentView(R.layout.home);
	
		et=(EditText) findViewById(R.id.editTexthome);
		
		String wv;
		wv=et.getText().toString();
		
		
	}

	
}
