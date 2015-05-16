package com.example.multimedia;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Camera extends Activity {

	ImageView iv;
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camera);
	b=(Button) findViewById(R.id.button1);
		iv=(ImageView) findViewById(R.id.imageView1);
	b.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View arg0) {
		Intent intent=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
		startActivityForResult(intent,0);
		}} );
	
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		Bitmap bm=(Bitmap) data.getExtras().get("data");
		iv.setImageBitmap(bm);
		
		
	}
	


	

}
