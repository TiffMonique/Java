/**
 * 
 */
package edu.unah.poo;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Tiffany
 *
 */
public class Mujer extends Humano{
	

	public Mujer(String nombre, LocalDate fechaNacimiento) {
		super(nombre, fechaNacimiento);
		
	}
	
	/*
	 * Implementacion del Metodo Trabajar de la Interfaz --> Comportamiento humano
	 */


	public void trabajar() {
		
		System.out.println("Seré la mejor Ingeniera en Sistemas que ha existido con trabajo duro y principios correctos.");
		
		
	}


	 //ToString
	public String toString() {
		return "Mujer [getNombre()=" + getNombre() + ", getFechaNacimiento()=" + getFechaNacimiento()
				+ ", getLstCancion()=" + getLstCancion() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
  
	
	
	
	
	

}
