package com.example.login;

import java.io.*;
import java.util.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.Context;
import android.os.*;

public class Usuario extends Activity {
	
	private String rut;
	private String nombre;
	private String email;
	private String password;
	private Context c;
	
	
	
	private ArchivoOffLine archivo;
	
	public Usuario(Context context)
	{
		archivo=new ArchivoOffLine(context);
		c=context;
	}
	public void cargarcsv(){
		
		
		/*File archivo=null;
		FileReader fr=null;
		BufferedReader br=null;
		try{
			archivo= new File("D:/usuario.txt");
			fr=new FileReader(archivo);
			br= new BufferedReader(fr);
			String linea;
			while((linea=br.readLine())!=null)
				System.out.println(linea);
			
		}catch(Exception e){
			e.printStackTrace();
		}*/
	}
	public boolean cargar()throws Exception {
		Vector<String> datos=archivo.getListaUsuarios();
		//String csvFilename ="D:usuario.csv";
		String csvFilename="D:\\usuario.csv";
		
		int i;
		AlertDialog alertDialog;
		alertDialog = new AlertDialog.Builder(c).create();
		alertDialog.setTitle("Usuario");
		
		for(i=0;i<datos.size();i++){
			String linea[]=datos.get(i).split(";");
			alertDialog.setMessage("[" + datos.get(i) + "][" + linea[1] + "][" + linea[2] + "]");
			alertDialog.show();
			
			if (linea[1].equals(email) && linea[2].equals(password)){
				return true;
			}
		}
		return false;
	}
	
	public String getEmail(){
		return email;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String vemail){
		email=vemail;
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String vnombre){
		nombre=vnombre;
	}
	public String getRut(){
		return rut;
	}
	
	public void setRut(String vrut){
		rut=vrut;
	}

	@Override
	public String toString() {
		return "Usuario [rut=" + rut + ", nombre=" + nombre + ", email="
				+ email + ", password=" + password + ", getEmail()="
				+ getEmail() + ", getPassword()=" + getPassword()
				+ ", getNombre()=" + getNombre() + ", getRut()=" + getRut()
				+ "]";
	}
	
	
	
}
