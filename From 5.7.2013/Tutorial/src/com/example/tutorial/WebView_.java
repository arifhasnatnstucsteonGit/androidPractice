package com.example.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebView_  extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	
		setContentView(R.layout.webview);
		WebView web=(WebView) findViewById(R.id.webView1);
		web.getSettings().setJavaScriptEnabled(true);
		
		String arif;
		arif="<html><body> <h1>I am Here!!!!</h1>This is a text </body></html>";
		web.loadData(arif,"text/html","UTF-8");
	
	}

	
}
