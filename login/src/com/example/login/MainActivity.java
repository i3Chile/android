package com.example.login;

import android.app.AlertDialog;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity{

	private Usuario usuario;
	EditText txtwrite;
	EditText txtwrite2;
	Button boton;
	public void lanzarLayout(View view){
    	Intent i= new Intent(this, Pasarvista.class);
    	startActivity(i);
    	
    }
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        txtwrite=(EditText)findViewById(R.id.editText1);
        
        usuario= new Usuario(this);
        //'Proceso de Sincronización'
        //1.- Leer el archivo de buffer de operaciones
        //2.- Enviar a la Base de Datos todas las operaciones del buffer
        //3.- Leer desde la BD toda la información del usuario
        //4.- Crear el archivo de trabajo off-line
        
        //Por el momento vamos crear el archivo cuando se inicie la aplicacion
        try{
        	ArchivoOffLine archivo=new ArchivoOffLine(this);
            archivo.crearArchivoUsuarios();	
        }catch (Exception e){
        	AlertDialog alertDialog;
			alertDialog = new AlertDialog.Builder(this).create();
			alertDialog.setTitle("Error");
			alertDialog.setMessage(e.getMessage());
			alertDialog.show();
			
        }
    }
   
    public void login(View view){
    	
    	
    	
    /*	try{
    		EditText vUsername = (EditText)findViewById(R.id.editText1);
    		EditText vPassword = (EditText)findViewById(R.id.editText2);
    		
    		usuario.setEmail(vUsername.getText().toString());
    		usuario.setPassword(vPassword.getText().toString());
    		
			if(usuario.cargar())
			{
				AlertDialog alertDialog;
				alertDialog = new AlertDialog.Builder(this).create();
				alertDialog.setTitle("ok");
				alertDialog.setMessage("OK");
				alertDialog.show();
				
				/*Intent intent=new Intent(this,Pasarvista.class);
				intent.putExtra("email", "a");
				intent.putExtra("password", "1");
				startActivity(intent);
			}
			
    	}catch(Exception e)
    	{
    		AlertDialog alertDialog;
			alertDialog = new AlertDialog.Builder(this).create();
			alertDialog.setTitle("Error");
			alertDialog.setMessage(e.getMessage());
			alertDialog.show();
    	}*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    void write(View v){
    	
    }
    void read(View v){
    	
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
