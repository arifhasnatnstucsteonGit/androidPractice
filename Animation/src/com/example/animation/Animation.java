package com.example.animation;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Animation extends Activity {
ImageView iv;
Button start,stop;
AnimationDrawable anim;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animation);
		iv=(ImageView) findViewById(R.id.imageView1);
		start=(Button) findViewById(R.id.button1);
		stop=(Button) findViewById(R.id.button2);
		
		start.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				BitmapDrawable one=(BitmapDrawable) getResources().getDrawable(R.drawable.a);
			
				BitmapDrawable three=(BitmapDrawable) getResources().getDrawable(R.drawable.eight);
				BitmapDrawable four=(BitmapDrawable) getResources().getDrawable(R.drawable.five);
				BitmapDrawable five=(BitmapDrawable) getResources().getDrawable(R.drawable.seven);
				BitmapDrawable six=(BitmapDrawable) getResources().getDrawable(R.drawable.six);
				int duration=250;
				anim=new AnimationDrawable();
				anim.addFrame(one, duration);


				anim.addFrame(three, duration);
				anim.addFrame(four, duration);
				anim.addFrame(five, duration);
				anim.addFrame(six, duration);
				
				
			
				
			
				
		
				iv.setBackgroundDrawable(anim);
				anim.start();
				
				
			}});
		
		
	}



	


}
