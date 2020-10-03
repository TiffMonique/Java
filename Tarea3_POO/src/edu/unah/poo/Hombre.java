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
public class Hombre extends Humano{
	

	

	public Hombre(String nombre, LocalDate fechaNacimiento) {
		super(nombre, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Implementacion del Metodo Trabajar de la Interfaz --> Comportamiento humano
	 */
	public void trabajar() {
		System.out.println("Seré el mejor Ingeniero en Sistemas que ha existido con trabajo duro y principios correctos.");
		
	}

	@Override
	public String toString() {
		return "Hombre [getNombre()=" + getNombre() + ", getFechaNacimiento()=" + getFechaNacimiento()
				+ ", getLstCancion()=" + getLstCancion() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	
	
	

}
