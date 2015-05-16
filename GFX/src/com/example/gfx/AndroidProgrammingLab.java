package com.example.gfx;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class AndroidProgrammingLab extends View {

	Bitmap gb,gb1;
	float changingY=0;
	float changingY1=0;
	
	public AndroidProgrammingLab(Context context) {
		super(context);
		gb=BitmapFactory.decodeResource(getResources(), R.drawable.ball);
		

		gb1=BitmapFactory.decodeResource(getResources(), R.drawable.ball);
		
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		canvas.drawColor(Color.WHITE);
		canvas.drawBitmap(gb, (canvas.getWidth()/8),changingY,null);
		canvas.drawBitmap(gb1, (canvas.getWidth()/2),changingY1,null);
		
		if(changingY<canvas.getHeight()){
			changingY1+=30;
			
			
		}else{
			
			changingY1=0;
		}
		
		if(changingY<canvas.getHeight()){
			changingY+=15;
			
			
		}else{
			
			changingY=0;
		}
		invalidate();
		
		}


	

}
