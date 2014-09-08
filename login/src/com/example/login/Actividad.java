package com.example.login;

public class Actividad {
	private String encargado;
	private String empresa;
	private String nombre;
	private String finicio;
	private String ftermino;
	private String riesgo;
	private String descripcion;
	private String epp;
	private String trabajador;
	public String getEncargado() {
		return encargado;
	}
	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFinicio() {
		return finicio;
	}
	public void setFinicio(String finicio) {
		this.finicio = finicio;
	}
	public String getFtermino() {
		return ftermino;
	}
	public void setFtermino(String ftermino) {
		this.ftermino = ftermino;
	}
	public String getRiesgo() {
		return riesgo;
	}
	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEpp() {
		return epp;
	}
	public void setEpp(String epp) {
		this.epp = epp;
	}
	public String getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(String trabajador) {
		this.trabajador = trabajador;
	}
	@Override
	public String toString() {
		return "Actividad [getEncargado()=" + getEncargado()
				+ ", getEmpresa()=" + getEmpresa() + ", getNombre()="
				+ getNombre() + ", getFinicio()=" + getFinicio()
				+ ", getFtermino()=" + getFtermino() + ", getRiesgo()="
				+ getRiesgo() + ", getDescripcion()=" + getDescripcion()
				+ ", getEpp()=" + getEpp() + ", getTrabajador()="
				+ getTrabajador() + "]";
	}
	
	
}
