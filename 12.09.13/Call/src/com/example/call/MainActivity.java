package com.example.call;

import java.io.InterruptedIOException;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Thread th=new Thread(){
        	public void run(){
        		try{
        			
        			sleep(10000);
        		}catch(InterruptedException exp){
        			
        			exp.printStackTrace();
        		}finally{
        			
        			Intent intent=new Intent("");
        			startActivity(intent);
        			
        		}
        		
        		
        		
        	}
        	
        	
        	
        	
        	
        };
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}