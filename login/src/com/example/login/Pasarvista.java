package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Pasarvista extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vista);
		
		/*Bundle extras = getIntent().getExtras();
		String s= extras.getString("email");
		String ss=extras.getString("password");*/
	}
	
	 public void lanzarcontrol(View view){
	    	Intent i= new Intent(this, Control.class);
	    	startActivity(i);
	    }
	
	 public void aplanificacion(View view){
	    	Intent i= new Intent(this, Planificacion.class);
	    	startActivity(i);
	    }
}
