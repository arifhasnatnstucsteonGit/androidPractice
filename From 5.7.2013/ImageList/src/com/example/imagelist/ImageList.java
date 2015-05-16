package com.example.imagelist;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ImageList extends ListActivity{

	String listis[]={"arif ","faysal ","syful ","masud","atik ","evan ","haider ","ami ","tumi ","se  ","ai boss","oi boss ","hai boss "};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.il);
		this.setListAdapter(new ArrayAdapter<String>(this,R.layout.imagelist,R.id.textView1ggggggggggg,listis));
		
	}

	
	
}
