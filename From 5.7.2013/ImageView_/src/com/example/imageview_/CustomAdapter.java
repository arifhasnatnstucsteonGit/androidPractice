package com.example.imageview_;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class CustomAdapter extends ArrayAdapter<String>{

	private final Activity context;
	private final String[] names;
	private final Integer[] imageIds;
	
public CustomAdapter(Activity context,String[] names,Integer[] imageIds){
	super(context,R.layout.activity_main,names);
	this.context=context;
	this.names=names;
	this.imageIds=imageIds;
	
	
	
	
	
}

@Override
public View getView(int position, View convertView, ViewGroup parent) {
	// TODO Auto-generated method stub
	Log.d("values of customAdapter",String.valueOf(position));
	LayoutInflater inflater=context.getLayoutInflater();
	/*View rowView =inflater.inflate(R.layout.activity_main,null,true
			;)
	
	*/
	
	
	
	
	
	return super.getView(position, convertView, parent);
	
}


	
	
}
