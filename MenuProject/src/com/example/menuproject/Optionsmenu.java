package com.example.menuproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Optionsmenu extends Activity{

	Button option,context,droupdown;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.activity_menu_test);
	option =(Button) findViewById(R.id.button3);
	context=(Button) findViewById(R.id.button1);
	droupdown=(Button) findViewById(R.id.button2);
	
	registerForContextMenu(context);
	context.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
		
			Toast.makeText(Optionsmenu.this, "Long press for context menues",Toast.LENGTH_LONG).show();
			
			
		}});
	
	droupdown.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Intent intent=new Intent("com.example.menuproject.DropDownMenu");
			startActivity(intent);
		}});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	option.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
			Toast.makeText(Optionsmenu.this, "press menu button for showing list",Toast.LENGTH_LONG).show();
			Intent intent =new Intent("com.example.menuproject.Optionsmenu");
			
			startActivity(intent);
			
			
		}});
	
	}
	
	
	
	

	




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater=getMenuInflater();
		inflater.inflate(R.menu.menu_test, menu);
		
		return true;
		
		
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	
		if(item.getItemId()==R.id.item1){
			
			Toast.makeText(Optionsmenu.this,"This is for item one for optionMenu",Toast.LENGTH_LONG).show();
			
			}else if(item.getItemId()==R.id.item2){
			Toast.makeText(Optionsmenu.this,"This is for item two forOptionMenu",Toast.LENGTH_LONG).show();
			
		}	
		else if(item.getItemId()==R.id.item3){
			Toast.makeText(Optionsmenu.this,"This is for item three for optionMenu",Toast.LENGTH_LONG).show();
			
		}	else{
			Toast.makeText(Optionsmenu.this,"select any one",Toast.LENGTH_LONG).show();
		}
		
		
		
			
			
		
		return true;
	}
	
	

	
	
	
	
	
	
	
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
	
	MenuInflater inflater=getMenuInflater();
	inflater.inflate(R.menu.menu_test, menu);
	
	
	
	
	
	
	}










	@Override
	public boolean onContextItemSelected(MenuItem item) {
		
		
		
        if(item.getItemId()==R.id.item1){
			
			Toast.makeText(Optionsmenu.this,"This is for item one for contextMenu",Toast.LENGTH_LONG).show();
			
		}else if(item.getItemId()==R.id.item2){
			Toast.makeText(Optionsmenu.this,"This is for item two for context",Toast.LENGTH_LONG).show();
			
		}	
		else if(item.getItemId()==R.id.item3){
			Toast.makeText(Optionsmenu.this,"This is for item three for context",Toast.LENGTH_LONG).show();
			
		}	else{
			Toast.makeText(Optionsmenu.this,"select any one",Toast.LENGTH_LONG).show();
		}
		
		
		return true;
	}

	
	
	
	
	
	
	
	
	
	
	
}
