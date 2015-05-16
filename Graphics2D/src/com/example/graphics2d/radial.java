package com.example.graphics2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RadialGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

public class radial extends View {

	public radial(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
	
		canvas.drawColor(Color.BLACK);
		Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
		RadialGradient grad=new RadialGradient( 0, 25,25,Color.GREEN,Color.RED,Shader.TileMode.MIRROR);
		paint.setShader(grad);
		canvas.drawCircle(getWidth()/2,getHeight()/2,getWidth()/3, paint);
		
	}
	

}
