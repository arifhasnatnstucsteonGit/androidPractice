package com.example.graphics2d;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menu extends ListActivity{

	String names[]={"Circle","LinearGradient","RadialGradient","SweepGradient","paintStyle","Bitmap","Shapes"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>( menu.this, android.R.layout.simple_list_item_1,names));
		
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		
		
		
		
		String cheese = names[position];
		try {
			Class ourClass = Class.forName("com.example.graphics2d." + cheese);
			Intent ourIntent = new Intent(menu.this, ourClass);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}
