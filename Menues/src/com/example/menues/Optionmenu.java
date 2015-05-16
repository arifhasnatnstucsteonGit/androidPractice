package com.example.menues;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class Optionmenu extends Activity{
Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.optionmenu);
		
		
		
	}
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater=getMenuInflater();
		inflater.inflate(R.menu.menues, menu);
		
		return true;
		
		
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	
		if(item.getItemId()==R.id.item1){
			
			Toast.makeText(Optionmenu.this,"This is for item one for optionMenu",Toast.LENGTH_LONG).show();
			
			}else if(item.getItemId()==R.id.item2){
			Toast.makeText(Optionmenu.this,"This is for item two forOptionMenu",Toast.LENGTH_LONG).show();
			
		}	
		else if(item.getItemId()==R.id.item3){
			Toast.makeText(Optionmenu.this,"This is for item three for optionMenu",Toast.LENGTH_LONG).show();
			
		}	else{
			Toast.makeText(Optionmenu.this,"select any one",Toast.LENGTH_LONG).show();
		}
		
		
		
			
			
		
		return true;
	}
	
	
	
	

}
