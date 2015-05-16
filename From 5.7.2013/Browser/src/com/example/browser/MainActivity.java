package com.example.browser;

import android.hardware.input.InputManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {

	EditText  et;
	WebView view;
	Button go,forward,back,history,chis,ccook,ccache,tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    et=(EditText) findViewById(R.id.editText1);
    view=(WebView) findViewById(R.id.webView1);
    go=(Button) findViewById(R.id.button1);
    back=(Button) findViewById(R.id.button2);
    forward=(Button) findViewById(R.id.button3);
    chis=(Button) findViewById(R.id.button4);
    ccook=(Button) findViewById(R.id.button5);
    ccache=(Button) findViewById(R.id.button6);
    history=(Button) findViewById(R.id.button7);
    tab=(Button) findViewById(R.id.button8);
    
    view.getSettings().setSupportMultipleWindows(true);
    view.getSettings().setDisplayZoomControls(true);
    view.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    view.getSettings().setGeolocationEnabled(true);
    view.getSettings().setUseWideViewPort(true);
    view.setWebViewClient(new Client());
    
    
    go.setOnClickListener(this);
    back.setOnClickListener(this);
    forward.setOnClickListener(this);
    chis.setOnClickListener(this);
    ccook.setOnClickListener(this);
    ccache.setOnClickListener(this);
    history.setOnClickListener(this);
    tab.setOnClickListener(this);
    }


   

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button1:
			String url=et.getText().toString();
			view.loadUrl(url);
			InputMethodManager manager=(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
			manager.hideSoftInputFromWindow(et.getWindowToken(), 0);
			view.getSettings().setLoadsImagesAutomatically(true);
			break;
			
		case R.id.button2:
			if(view.canGoBack()){
				view.goBack();
				
				
			}
			break;
		case R.id.button3:
			if(view.canGoForward()){
				view.goForward();
			}
			break;
		case R.id.button4:
		
			view.stopLoading();
			view.reload();
			view.refreshDrawableState();
			view.capturePicture();
			view.zoomIn();
			
			
		
		
			
			break;
		case R.id.button5:
			break;
		case R.id.button6:
			break;
		case R.id.button7:
			
			break;
		case R.id.button8:
			view.setSoundEffectsEnabled(true);
			break;
		
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }

}
