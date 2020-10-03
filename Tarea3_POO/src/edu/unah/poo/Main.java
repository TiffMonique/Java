/**
 * 
 */
package edu.unah.poo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tiffany
 *
 */
public class Main {

	public static void main(String[] args) {
		
		/*****  CREANDO OBJETOS DE HUMANO  *******/
		
		/*
		 * Atributos de Humano  String nombre, LocalDate fechaNacimiento, ArrayList<Cancion>();
		 */
		
		
		Cancion cancion1 = new Cancion("You Say",123);
		Cancion cancion2 = new Cancion("Another in the fire", 456);
		Cancion cancion3 = new Cancion("Aslan", 789);
		Cancion cancion4 = new Cancion("Real love", 101);
		
		Cancion cancion5 = new Cancion("Fuego de Dios",102 );
		Cancion cancion6 = new Cancion("A ti la Gloria",103 );
		Cancion cancion7 = new Cancion("El niño de Belén", 104);
		Cancion cancion8 = new Cancion("A Quien Iré",105);
		
		
		//Creando LocalDate
		LocalDate date1 = LocalDate.of(2000, Month.JULY, 4);
		LocalDate date2 = LocalDate.of(1976, Month.APRIL, 11);
	
		
		Humano h = new Mujer ("Monique Matamoros", date1);
		Humano h2 = new Hombre ("David Salgado", date2);
	
		//Crear  listas de Canciones
		
		h.adicionarCancion(cancion1);
		h.adicionarCancion(cancion2);
		h.adicionarCancion(cancion3);
		h.adicionarCancion(cancion4);
	
		
		h2.adicionarCancion(cancion5);
		h2.adicionarCancion(cancion6);
		h2.adicionarCancion(cancion7);
		h2.adicionarCancion(cancion8);
		
		/*****  CREANDO OBJETOS DE TIPO ANIMAL  *******/
		/*
		 * Atributos de Animal String nombre, LocalDate fechaNacimiento;
		 */
		
		//Creando LocalDate
	    LocalDate dateP = LocalDate.of(2020, Month.MARCH, 7);
	    LocalDate dateG = LocalDate.of(2019, Month.APRIL, 11);
	    
		Animal a1 = new Perro ("Rufo", dateP);
		Animal a2 = new Gato ("Michito" , dateG);
		
		
		/***PRESENTACION EN PANTALLA**/ 
		System.out.println("\u001B[36m===========================================================================================\u001B[0m");
		System.out.println("                                Comportamiento Humano                                      ");
		System.out.println("                                  Y Acciones Comunes                                       ");
		System.out.println("\u001B[36m===========================================================================================\u001B[0m");
		System.out.println("\n");
		System.out.println("\u001B[33m                                --------> Humanos <--------        \u001B[0m      ");
		System.out.println("\n");
		System.out.println("\u001B[45m**********************************         Mujer         **********************************\u001B[0m");
		h.hablar();
		h.estudiar();
		h.trabajar();
		System.out.println("\n");
		System.out.println("\u001B[35mMi lista de Canciones Favoritas es: \u001B[0m");
		h.listarCanciones();
		h.buscarCancion("Oceans");
		System.out.println("\n");
		System.out.println("\u001B[44m**********************************         Hombre         *********************************\u001B[0m");
		h2.dormir();
		System.out.println("Desperté y ahora...");
		h2.alimentarse();
		System.out.println("\n");
		System.out.println("\u001B[36mMi lista de Canciones Favoritas es: \u001B[0m");
		h2.listarCanciones();
		h2.eliminarCancion("Flores de Mime");
		System.out.println("\n");
		h2.listarCanciones();
		System.out.println("------------------------------------");
		System.out.println("¿Quién de los dos humanos es mayor?");
		System.out.println(h.compararEdad(h2));
		System.out.println("\u001B[33m                                 --------> Animales <--------        \u001B[0m      ");
		System.out.println("\n");
		System.out.println("\u001B[46m***********************************          Perro         **********************************\u001B[0m");
		System.out.println("Nombre-->"+a1.getNombre());
		a1.dormir();
		a1.alimentarse();
		System.out.println("\n");
		System.out.println("\u001B[42m***********************************          Gato          **********************************\u001B[0m");
		System.out.println("Nombre-->"+a2.getNombre());
		a2.dormir();
		a2.alimentarse();
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
}
