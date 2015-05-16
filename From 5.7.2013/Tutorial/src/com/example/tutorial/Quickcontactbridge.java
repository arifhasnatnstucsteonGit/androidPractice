package com.example.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.QuickContactBadge;

public class Quickcontactbridge extends Activity{

	QuickContactBadge qb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quickcontact);
		qb=(QuickContactBadge) findViewById(R.id.quickContactBadge1);
		qb.assignContactFromEmail("arif@gmail.com", true);
		qb.assignContactFromPhone("01737480544",true);
		qb.setMode(ContactsContract.QuickContact.MODE_SMALL);
		
	}

	
}
