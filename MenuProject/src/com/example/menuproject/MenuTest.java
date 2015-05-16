package com.example.menuproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MenuTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_test);
		
		Button b=(Button) findViewById(R.id.button1);
	
		registerForContextMenu(b);
		
		
		
	}
	
	
	

	
	
	
	





	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater inflater=getMenuInflater();
		inflater.inflate(R.menu.menu_test, menu);
		
		
	}


	@Override
	public boolean onContextItemSelected(MenuItem item) {
		if(item.getItemId()==R.id.item1){Toast.makeText(MenuTest.this,"this is a menu", Toast.LENGTH_LONG).show();}
		else if(item.getItemId()==R.id.item1){Toast.makeText(MenuTest.this, "This is second menu",  Toast.LENGTH_LONG).show();}
		else{Toast.makeText(MenuTest.this, "This is second menu",  Toast.LENGTH_LONG).show();}
		return super.onContextItemSelected(item);
	}






	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater=getMenuInflater();
		inflater.inflate(R.menu.menu_test, menu);
		
		
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.menu_test, menu);
		return true;
	}

}
