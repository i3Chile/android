package com.example.login;

import java.io.*;
import java.util.Vector;

import android.content.Context;

public class ArchivoOffLine {
	private String archivo="usuario.txt";
	private Context context;
	private String Archivoact;
	public ArchivoOffLine(Context context){
		this.context=context;
	}
	
	public void crearArchivoUsuarios() throws Exception{
			FileOutputStream f=context.openFileOutput(archivo,Context.MODE_APPEND);
			String linea="5;b;6\n";
			f.write(linea.getBytes());
			f.close();
	}
	
	public Vector<String>getListaUsuarios() throws Exception{
		Vector<String> resultado=new Vector<String>();
		
		FileInputStream f =context.openFileInput(archivo);
		BufferedReader entrada=new BufferedReader(new InputStreamReader(f));
		String linea;
		while ((linea=entrada.readLine())!=null){
			resultado.add(linea);			
		}
		f.close();
		return resultado;
	}
	
}
