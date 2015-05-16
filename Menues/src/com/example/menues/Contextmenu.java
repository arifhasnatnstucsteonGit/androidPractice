package com.example.menues;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contextmenu extends Activity{
     Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menues);
		b=(Button) findViewById(R.id.button1);
		registerForContextMenu(b);
		
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater inflater=getMenuInflater();
		inflater.inflate(R.menu.menues, menu);
	
		
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		if(item.getItemId()==R.id.item1){Toast.makeText(Contextmenu.this,"this is a menu", Toast.LENGTH_LONG).show();}
		else if(item.getItemId()==R.id.item1){Toast.makeText(Contextmenu.this, "This is second menu",  Toast.LENGTH_LONG).show();}
		else{Toast.makeText(Contextmenu.this, "This is second menu",  Toast.LENGTH_LONG).show();}
		return true;
	}

	
	
	
	

}
