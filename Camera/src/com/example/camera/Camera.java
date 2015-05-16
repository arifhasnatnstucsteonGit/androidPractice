package com.example.camera;

import java.io.IOException;
import java.io.InputStream;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Camera extends Activity implements View.OnClickListener {
ImageView iv;
ImageButton ib;
Button b;
Intent i;
Bitmap bm;
final static  int a=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camera);
		InputStream is=getResources().openRawResource(R.drawable.ic_launcher);
		bm=BitmapFactory.decodeStream(is);
		iv=(ImageView) findViewById(R.id.imageView1);
		ib=(ImageButton) findViewById(R.id.imageButton1);
		b=(Button) findViewById(R.id.button1);
		ib.setOnClickListener( this);
		b.setOnClickListener( this);
		
	}
	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
			
			
		case R.id.button1:
			

			i=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(i, a);
			
			
			
			break;
			
			
			
		case R.id.imageButton1:
			try {
				getApplication().setWallpaper(bm);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		}
		
		
		
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==RESULT_OK){
			Bundle extras=data.getExtras();
			bm=(Bitmap) extras.get("data");
			iv.setImageBitmap(bm);
			
			
			
		}
		
	}
	
	

	

}
