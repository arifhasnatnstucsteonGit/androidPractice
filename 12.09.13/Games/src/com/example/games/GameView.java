package com.example.games;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;

public class GameView extends View {

	public GameView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Bitmap star=BitmapFactory.decodeResource(getResources(), R.drawable.b);
		canvas.drawColor(Color.BLACK);
		canvas.drawBitmap(star, 10,10,null);
		
	}
	
	

    
}
