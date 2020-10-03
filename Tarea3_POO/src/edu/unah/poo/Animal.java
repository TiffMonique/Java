/**
 * 
 */
package edu.unah.poo;

import java.time.LocalDate;

/**
 * @author Tiffany
 *
 */

public abstract class Animal implements AccionesComunes{
	
	private String nombre;
	private LocalDate fechaNacimiento;
	
	//GETs y SETs
	public String getNombre() {
		
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	//Constructor
	public Animal(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Metodo toString
	public String toString() {
		return "Animal [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
	//Metodo Dormir
	public void dormir() {
		System.out.println("zzZZZzzzZZZzz");
	}

	//Metodo Alimentarse
	public void alimentarse() {
		System.out.println("mmmmm");
	}

	
	
	

}
