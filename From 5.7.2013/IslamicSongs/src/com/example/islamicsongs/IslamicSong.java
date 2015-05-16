package com.example.islamicsongs;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IslamicSong extends Activity {
Button b;
MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10,mp11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islamic_song);
        
         b=(Button) findViewById(R.id.button1);  
        registerForContextMenu(b);
        mp1=MediaPlayer.create(this, R.raw.simple);
        mp2=MediaPlayer.create(this, R.raw.male);
        mp3=MediaPlayer.create(this, R.raw.female);
        mp4=MediaPlayer.create(this, R.raw.old);
        mp5=MediaPlayer.create(this, R.raw.duet);
        mp6=MediaPlayer.create(this, R.raw.remix);
        mp7=MediaPlayer.create(this, R.raw.b);
        mp8=MediaPlayer.create(this, R.raw.c);
        mp9=MediaPlayer.create(this, R.raw.d);
        mp10=MediaPlayer.create(this, R.raw.e);
        mp11=MediaPlayer.create(this, R.raw.f);
    }
    @Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated met`hod stub
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater inflater=getMenuInflater();
		inflater.inflate(R.menu.islamic_song, menu);
	
		
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		if(item.getItemId()==R.id.item1){
			
			//Toast.makeText(IslamicSong.this,"this is a menu", Toast.LENGTH_LONG).show();
		
		
			

			
		
			mp1.start();
			
		
		
		}
		else if(item.getItemId()==R.id.item2){
			mp2.start();
			
			
			
			
			
		}else if(item.getItemId()==R.id.item3){
			mp3.start();
			
			
			
		}else if(item.getItemId()==R.id.item4){
			mp4.start();
			
			
			
		}else if(item.getItemId()==R.id.item5){
			mp5.start();
			
			
		}else if(item.getItemId()==R.id.item6){
			mp6.start();
			
			
			
			
			
		}else if(item.getItemId()==R.id.item7){
			mp7.start();
			
			
			
			
		}else if(item.getItemId()==R.id.item8){
			mp8.start();
			
			
			
			
			
			
		}else if(item.getItemId()==R.id.item9){
			mp9.start();
			
			
			
			
			
		}else if(item.getItemId()==R.id.item10){
			mp10.start();
			
			
			
			
			
		}else if(item.getItemId()==R.id.item11){
			mp11.start();
			
			
			
			
			
		}
		else{
			
			
			
			
			Toast.makeText(IslamicSong.this, "Select any one to paly",  Toast.LENGTH_LONG).show();}
		return true;
	}

	
	
	


    
    
}
