package com.example.graphics2d;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Shapes extends Activity{
	Button oval,rectangle,round,arc,path,line;
	ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_circle);
		rectangle=(Button) findViewById(R.id.rectangle);
		round=(Button) findViewById(R.id.roundrect);
		oval=(Button) findViewById(R.id.oval);
		arc=(Button) findViewById(R.id.arc);
		path=(Button) findViewById(R.id.path);
		line=(Button) findViewById(R.id.line);
		oval.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
			
				ShapeDrawable draw=new ShapeDrawable(new OvalShape());
				draw.getPaint().setColor(Color.RED);
				draw.setIntrinsicWidth(100);
				draw.setIntrinsicHeight(100);
				iv=(ImageView) findViewById(R.id.imageView1);
				iv.setImageDrawable(draw);
				
				
				
				
				
				
				
				
			}});
		
		rectangle.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				ShapeDrawable draw=new ShapeDrawable(new RectShape());
				draw.getPaint().setColor(Color.RED);
				draw.setIntrinsicWidth(100);
				draw.setIntrinsicHeight(20);
				iv=(ImageView) findViewById(R.id.imageView1);
				iv.setImageDrawable(draw);
				
				
				
				
			}});
		
		
		round.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				ShapeDrawable draw=new ShapeDrawable(new RoundRectShape(new float[]{5,5,5,5,5,5,5,5},null,null));
				draw.getPaint().setColor(Color.RED);
				draw.setIntrinsicWidth(100);
				draw.setIntrinsicHeight(20);
				iv=(ImageView) findViewById(R.id.imageView1);
				iv.setImageDrawable(draw);
				
				
				
				
			}});
		arc.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				ShapeDrawable draw=new ShapeDrawable(new ArcShape(50,200));
				draw.getPaint().setColor(Color.RED);
				draw.setIntrinsicWidth(100);
				draw.setIntrinsicHeight(100);
				iv=(ImageView) findViewById(R.id.imageView1);
				iv.setImageDrawable(draw);
				
				
				
				
			}});
		
		
		path.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Path path=new Path();
				path.moveTo(0, 50);
				path.lineTo(50,75);
				path.lineTo(75,100);
				path.lineTo(100,130);
				path.lineTo(130,150);
				path.lineTo(150,200);
				path.lineTo(200,250);
				path.lineTo(250,300);
				
				ShapeDrawable draw=new ShapeDrawable(new PathShape(path,100,100));
				draw.getPaint().setColor(Color.RED);
				draw.setIntrinsicWidth(100);
				draw.setIntrinsicHeight(100);
				iv=(ImageView) findViewById(R.id.imageView1);
				iv.setImageDrawable(draw);
				
				
				
				
			}});
		
		
		line.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
			Path path=new Path();
			path.moveTo(0,100);
			path.lineTo(30,100);
			path.lineTo(150,200);
			path.lineTo(200,250);
			path.lineTo(250,300);
			path.lineTo(50, 100);
				ShapeDrawable draw=new ShapeDrawable(new PathShape(path,100,100));
				draw.getPaint().setColor(Color.RED);
				draw.setIntrinsicWidth(100);
				draw.setIntrinsicHeight(100);
				iv=(ImageView) findViewById(R.id.imageView1);
				iv.setImageDrawable(draw);
				
				
				
				
			}});
	}

	
	
	
}
