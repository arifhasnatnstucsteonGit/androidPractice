package com.example.savings;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class Sqlite extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
	
		setContentView(R.layout.sqlite);
		
		SQLiteDatabase database=openOrCreateDatabase("Name",MODE_PRIVATE,null);
		database.execSQL("CREATE TABLE IF NOT EXIST myname(FirstName VARCHAR ,LastName VARCHAR, Age INT(5))");
		database.execSQL("INSERT INTO myname VALUES('arif','hasnat',22);");
		database.close();
	
	}
	
	
	
}
