package com.example.show;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class frontpage extends Activity implements OnClickListener{
Button b;
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onPostCreate(savedInstanceState);
		setContentView(R.layout.pageone);
	
	b=(Button) findViewById(R.id.button1);
	b.setOnClickListener(this);
	
	}
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent intent =new Intent("com.example.show.MainActivity");
		startActivity(intent);
		
		
	}

	
}
