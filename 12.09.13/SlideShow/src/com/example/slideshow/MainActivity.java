
package com.example.slideshow;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends Activity {
	Integer[] images={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressWarnings("deprecation")
		Gallery ga=(Gallery) findViewById(R.id.gallery1);
		ga.setAdapter(new ImageAdapter(this));
		ga.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				Toast.makeText(getApplicationContext(), "pic"+(position+1)+"selected",Toast.LENGTH_SHORT).show();
				ImageView imageView=(ImageView) findViewById(R.id.imageView1);
				imageView.setImageResource(images[position]);
				
				
			}});
        
        
    }
    public class ImageAdapter extends BaseAdapter{

    	private Context context;
    	private int ib;
    	
    	
		public ImageAdapter(Context c) {
			// TODO Auto-generated constructor stub
		
		context =c;
		TypedArray a=obtainStyledAttributes(R.styleable.MyGallery);
		ib=a.getResourceId(R.styleable.MyGallery_android_galleryItemBackground,0);
		a.recycle();
		
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return images.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			
			//ImageView iv=(ImageView) findViewById(R.id.imageView1);
			ImageView imageview=new ImageView(context);
			imageview.setImageResource(images[position]);
			imageview.setLayoutParams(new Gallery.LayoutParams(150,120));
			imageview.setScaleType(ImageView.ScaleType.FIT_XY);
			imageview.setBackgroundResource(ib);
			
			return imageview;
		}}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
