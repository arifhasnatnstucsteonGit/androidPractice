package com.example.menuproject;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DropDownMenu extends ListActivity{

	String names[]={"MenuTest","two"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>( DropDownMenu.this, android.R.layout.simple_list_item_1,names));
		
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		
		
		
		
		String cheese = names[position];
		try {
			Class ourClass = Class.forName("com.example.menuproject." + cheese);
			Intent ourIntent = new Intent(DropDownMenu.this, ourClass);
			startActivity(ourIntent);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}

