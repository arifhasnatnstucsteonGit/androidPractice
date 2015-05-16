package com.example.slide;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
   
    public int currentimageindex=0;
//    Timer timer;
//    TimerTask task;
    ImageView slidingimage;
   
    private int[] IMAGE_IDS = {
            R.drawable.a, R.drawable.b, R.drawable.c,
            R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i
        };
   
   
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler mHandler = new Handler();

        // Create runnable for posting
        final Runnable mUpdateResults = new Runnable() {
            public void run() {
               
                AnimateandSlideShow();
               
            }
        };
       
        int delay = 1000; // delay for 1 sec.

        int period = 15000; // repeat every 4 sec.

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {

             mHandler.post(mUpdateResults);

        }

        }, delay, period);
       
       
              
    }

    public void onClick(View v) {
   
        finish();
        android.os.Process.killProcess(android.os.Process.myPid());
      }
   
    /**
     * Helper method to start the animation on the splash screen
     */
    private void AnimateandSlideShow() {
       
       
        slidingimage = (ImageView)findViewById(R.id.imageView1);
           slidingimage.setImageResource(IMAGE_IDS[currentimageindex%IMAGE_IDS.length]);
          
           currentimageindex++;
       
           Animation rotateimage = AnimationUtils.loadAnimation(this, R.dimen.activity_vertical_margin);
         
       
          slidingimage.startAnimation(rotateimage);
         
             
       
    }   
   
   



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
