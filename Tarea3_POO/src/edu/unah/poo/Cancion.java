package edu.unah.poo;

public class Cancion {
	private String nombre;
	private int id;
	
	
	//GETs & SETs
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//Constructor
	public Cancion(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	
	
	//Metodo toString
	public String toString() {
		return "Cancion [nombre=" + nombre + ", id=" + id + "]";
	}
	
	
	
		
	

}
