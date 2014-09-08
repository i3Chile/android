package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class Planificacion extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.planificacion);
		
		final DatePicker dp=(DatePicker)findViewById(R.id.dp);//aqui tengo q buscar el id del boton para llamarlo=  https://www.youtube.com/watch?v=BWCYFUpXGio
		final Button btn=(Button)findViewById(R.id.button1);
	}	


	 
		/*btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Toast.makeText(Planificacion.this, dp.getDayOfMonth()+""+dp.getMonth()+""+dp.getYear(), Toast.LENGTH_SHORT).show();
				
			}
		});
			
			
	
	
	
	
	//btn.setOnClickListener(new OnClickListener(){
		
		
	//})
	//(Planificacion.this,dp.getDayOfMonth()+" "+ dp.getMonth()+" "+dp.getYear(),Toast.LENGTH_SHORT).show();
	}*/
	public void cargarplanificacion(View view){
    	Intent i= new Intent(this, Ingresactividplan.class);
    	startActivity(i);
    }
}

