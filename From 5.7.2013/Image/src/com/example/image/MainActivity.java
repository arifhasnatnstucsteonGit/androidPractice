
package com.example.image;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

	String image[]={"one ","two","three","four","five","six","seven","eight","Nine","ten"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String > adapter=new ArrayAdapter<String > (this,R.layout.image,R.id.imageText,image);
        setListAdapter(adapter);
        
        
        
    }


   
    
}
