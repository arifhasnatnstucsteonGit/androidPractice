package com.example.graphics2d;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;

public class Circle2D extends View {

	public Circle2D(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
	
		canvas.drawColor(Color.BLACK);
		
		Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
	
		//Typeface face=Typeface.create(Typeface.MONOSPACE, Typeface.BOLD_ITALIC);
		Typeface face=Typeface.createFromAsset(getContext().getAssets(), "chess1.ttf");
		

		paint.setColor(Color.CYAN);
		paint.setTextSize(20);
		paint.setTypeface(face);
	
		canvas.drawText("WwQqRr ",20,20, paint);
		canvas.drawText("WwQqRr ",20,40, paint);
		canvas.drawText("WwQqRr ",20,120, paint);
		canvas.drawText("WwQqRr ",20,150, paint);
		
		paint.setColor(Color.RED);
		canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2, canvas.getWidth()/3, paint);
	
		
		
		
		
		
	
	}
	
	

}
