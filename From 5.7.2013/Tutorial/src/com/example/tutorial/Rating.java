package com.example.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class Rating extends Activity{

	RatingBar ratings;
	EditText et;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ratingbar);
		et=(EditText) findViewById(R.id.editText1);
		
	 ratings=(RatingBar) findViewById(R.id.ratingBar1);
	ratings.setOnRatingBarChangeListener(new OnRatingBarChangeListener(){

		@Override
		public void onRatingChanged(RatingBar ratingBar, float rating,
				boolean fromUser) {
			et.setText(String.valueOf(rating));
			
			
		}});	
		
	}
  
	
}
