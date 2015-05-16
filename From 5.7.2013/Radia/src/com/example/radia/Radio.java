package com.example.radia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.RadioGroup;

public abstract  class Radio extends Activity implements OnCheckedChangeListener  {
//RadioButton one,two,three;
CheckBox a,b,c,d;
RadioGroup radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        
// one=(RadioButton) findViewById(R.id.radio0);
 //two=(RadioButton) findViewById(R.id.radio1);
 //three=(RadioButton) findViewById(R.id.radio2);
        
        
        
        
       // a=(CheckBox) findViewById(R.id.checkBox1);
       // b=(CheckBox) findViewById(R.id.checkBox2);
       // c=(CheckBox) findViewById(R.id.checkBox3);
       // d=(CheckBox) findViewById(R.id.checkBox4);
        
        
       //one.setOnCheckedChangeListener(this);
      // two.setOnCheckedChangeListener(this);
       //three.setOnCheckedChangeListener(this);
   
        
       // a.setOnCheckedChangeListener(this);
       // b.setOnCheckedChangeListener(this);
      
        //c.setOnCheckedChangeListener(this);
       // d.setOnCheckedChangeListener(this);
        
        
        radio =(RadioGroup) findViewById(R.id.radioGroup1);
        radio.setOnCheckedChangeListener(this);
    }

	

	public void onCheckedChanged(RadioButton arg0, int arg1) {

    switch(arg0.getId()){
    
    case R.id.radio0:
    	Toast.makeText(this,"one",Toast.LENGTH_LONG).show();
    	
    	break;
    	
    case R.id.radio1:
    	Toast.makeText(this,"two",Toast.LENGTH_LONG).show();
    	
    	break;
    	
    case R.id.radio2:
    	Toast.makeText(this,"three",Toast.LENGTH_LONG).show();
    	
    	break;
    	
    
    
    }
    
}



	
}