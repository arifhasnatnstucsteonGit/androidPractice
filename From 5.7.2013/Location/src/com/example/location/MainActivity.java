package com.example.location;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener {

	String names[]={"Rajshahi","Rangpur","Noakhali"};
	Spinner sp;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adater=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,names);
        sp.setAdapter(adater);
        sp.setOnItemSelectedListener(this);
    }

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		switch(sp.getSelectedItemPosition()){
		case 0:
			
			Toast.makeText(MainActivity.this,"one",Toast.LENGTH_LONG).show();
			break;
		case 1:
			Toast.makeText(MainActivity.this,"one",Toast.LENGTH_LONG).show();
			break;
		case 2:
			Toast.makeText(MainActivity.this,"one",Toast.LENGTH_LONG).show();
			break;
		
		
		}
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}


    
}
