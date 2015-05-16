package com.example.graphics2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.graphics.Shader;
import android.view.View;

public class Sweep extends View {

	public Sweep(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
		//SweepGradient grad=
	canvas.drawColor(Color.BLACK);
	
		int a[]=new int[]{Color.RED,Color.BLUE,Color.RED,Color.GREEN,Color.RED,Color.GREEN};
		SweepGradient grad=new SweepGradient(250,259,a,null);
		
		
		paint.setShader(grad);
		canvas.drawCircle(getWidth()/2,getHeight()/2,getWidth()/3, paint);
		
	}

}
