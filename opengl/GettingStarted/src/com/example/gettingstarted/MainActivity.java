package com.example.gettingstarted;

import android.os.Bundle;
import android.app.Activity;
import android.opengl.GLSurfaceView;
public class MainActivity extends Activity {
GLSurfaceView surface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        

        surface=new GLSurfaceView(this);
        surface.setRenderer(new Gl());
        setContentView(surface);
      
    }
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		surface.onPause();
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		surface.onResume();
	}


   
    
}
