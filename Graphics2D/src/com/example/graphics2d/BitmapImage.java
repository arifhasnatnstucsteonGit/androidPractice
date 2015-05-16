package com.example.graphics2d;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
public class BitmapImage extends View {

	public BitmapImage(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
	canvas.drawColor(Color.BLACK);
	Bitmap image=BitmapFactory.decodeResource(getResources(), R.drawable.images);

	//Bitmap bm=Bitmap.createScaledBitmap(image, 150,150, false);
	//canvas.drawBitmap(bm,25,150,null);
		Matrix matrix =new Matrix();
		
	
		matrix.preRotate(30);
		matrix.preScale(-1,1);
	Bitmap trans=Bitmap.createBitmap(image,0,0,image.getWidth(),image.getHeight(),matrix,false);
		
		

	canvas.drawBitmap(trans,25,25,null);
	image.recycle();	
	}
	
	

}
