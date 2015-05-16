package com.example.imagelist;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView l1,l2;
	String listis[]={"arif ","faysal ","syful ","masud","atik ","evan ","haider ","ami ","tumi ","se  ","ai boss","oi boss ","hai boss "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        //ListView lisview=getListView();
        //lisview.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        //lisview.setTextFilterEnabled(true);
       // setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,listis) );
        ArrayAdapter<String > adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listis);
        l1.setAdapter(adapter);
        
        l1=(ListView) findViewById(R.id.listView1);
        
        l1.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				int index=arg2;
				Toast.makeText(getApplicationContext(), "You select"+listis[index], Toast.LENGTH_LONG).show();
				
				
			}});
        
        //---------------------------------------------------2nd list--------------------------------------
 l2.setAdapter(adapter);
        
        l2=(ListView) findViewById(R.id.listView2);
        
        l2.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				int index2=arg2;
				Toast.makeText(getApplicationContext(), "You select"+listis[index2], Toast.LENGTH_LONG).show();
				
				
			}});
        
        
    }



	
    
}
