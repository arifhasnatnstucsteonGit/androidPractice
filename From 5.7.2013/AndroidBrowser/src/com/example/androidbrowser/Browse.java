package com.example.androidbrowser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Browse extends Activity implements OnClickListener, OnItemSelectedListener{
WebView wv;
String url;
EditText et;
Button back,go,front,reload,stop;
Spinner sp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browse);
		wv=(WebView) findViewById(R.id.webView1);
		back=(Button) findViewById(R.id.Browser_back);
		go=(Button) findViewById(R.id.buttonGo);
		front=(Button) findViewById(R.id.BrowserForward);
		reload=(Button) findViewById(R.id.buttonReload);
		stop=(Button) findViewById(R.id.buttonStop);
		//----------------------------------for spinner...........................
		sp=(Spinner) findViewById(R.id.spinner1);
		
        String service[]={"Settings","Clear Cache","Clear History","Recommanded Pages","Zoom In","Zoom Out","Capture Image",""};
		ArrayAdapter<String> array=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,service);
		sp.setAdapter(array);
		sp.setOnItemSelectedListener(this);
		
		//........................................................................
		
		
//setting ...................
		
		
	   wv.getSettings().setBuiltInZoomControls(true);
	   wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
	   wv.getSettings().setJavaScriptEnabled(true);
		//wv.getSettings().setDatabaseEnabled(true);
	   wv.getSettings().setSupportMultipleWindows(true);
       wv.setWebViewClient(new Client() );
	
//..............................		
		
		
		
		    et=(EditText) findViewById(R.id.editText1);
		    wv.loadUrl("http://www.google.com");
		    
		    back.setOnClickListener(this);
		    go.setOnClickListener(this);
		    front.setOnClickListener(this);
		    reload.setOnClickListener(this);
		    stop.setOnClickListener(this);
		    
		    


	}
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		 
		case R.id.buttonGo:
			 url=et.getText().toString();
			wv.loadUrl(url);
			
			
			
			break;
		case R.id.BrowserForward:
			if(wv.canGoForward()){
				wv.goForward();
			}
			break;
		case R.id.Browser_back:
			if(wv.canGoBack()){
				wv.goBack();
				wv.setContentDescription(url);
			}
			break;
		case R.id.buttonStop:
			wv.stopLoading();
			break;
		case R.id.buttonReload:
			wv.reload();
			
			break;
			
		 
		
		
		
		
		
		
		
		
		}
		
	}
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {


		switch(sp.getSelectedItemPosition()){
		
		case 1:
			wv.clearCache(true);
			Toast.makeText(getApplicationContext(), "Cache is Cleared", Toast.LENGTH_LONG).show();
			break;
		case 2:
			Toast.makeText(getApplicationContext(), "History  is Cleared", Toast.LENGTH_LONG).show();
			wv.clearHistory();
			break;
		case 3:

			Intent intent =new Intent("com.example.androidbrowser.RP");
			
			
			startActivity(intent);
			break;
		case 4:
			wv.zoomIn();

			break;
		case 5:
			wv.zoomOut();
			break;
		case 6:
			
			wv.capturePicture();
			
			break;
			
	


		}
		
	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}

