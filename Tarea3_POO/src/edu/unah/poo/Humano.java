/**
 * 
 */
package edu.unah.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Tiffany
 *
 */
public abstract class Humano implements AccionesComunes, ComportamientoHumano{
	
	private String nombre;
	private LocalDate fechaNacimiento;
	
	private List<Cancion> lstCancion = new ArrayList<Cancion>();
	
	//GETs & SETs
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

	
	
	public List<Cancion> getLstCancion() {
		return lstCancion;
	}
	public void setLstCancion(List<Cancion> lstCancion) {
		this.lstCancion = lstCancion;
	}
	
	
	//Constructor
	public Humano(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	//Metodo toString
	public String toString() {
		return "Humano [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", cancion=" + lstCancion + "]";
	}
	
	/*
	 * 
	 * Implementacion de los metodos de la interfaz -->Acciones comunes
	 * 
	 */
	
	
	//Metodo Dormir
		public void dormir() {
			System.out.println("Soy "+this.getNombre()+" y estoy durmiendo.");
			
		}
		

		//Metodo Alimentarse
		public void alimentarse() {
			System.out.println("Estoy comiendo.");
			
		}
		
        //Metodo Hablar
		public void hablar() {
			System.out.println("¡Hola!, me da mucho gusto saludarte.");
			System.out.println("Mi nombre es:"+this.getNombre());
			
		}
		
		/*
		 * Implementacion de los metodos de la interfaz --> Comportamiento humano
		 * 
		 */
		
		//Metodo Estudiar
		public void estudiar() {
			System.out.println("Estoy haciendo la tarea de POO.");
			
		}
		
		
		//Metodo Listar Canciones
		public void listarCanciones() {
			for(int i=0; i<lstCancion.size(); i++ ) {
			System.out.println(">"+lstCancion.get(i).getNombre().toString());
			}
			
		}
		
		
		/**Metodo Buscar Cancion
		 * Busca el objeto por nombre
		 * @author Tiffany Matamoros
		 * @since 1/10/2020
		 * 
		 */
		
		@SuppressWarnings("unused")
		public void buscarCancion(String nombre) {
			
			for(int i= 0; i <=this.lstCancion.size(); i++){ //Iniciar el ciclo para recorrer la lista
				if(this.lstCancion.get(i).getNombre().equals(nombre)) {
					System.out.println("\u001B[33mLa cancion SÍ existe en la lista.\u001B[0m");
					break;
				}else {
					System.out.println("\u001B[31mLa cancion NO existe en la lista.\u001B[0m");
					break;
				}	
			}	
		}
	
	

		//Metodo Eliminar Cancion
		public void eliminarCancion( String nombre) {
			List<Cancion> paraBorrar = new ArrayList<>();
	

		                for (Cancion c1 : lstCancion) {
		                    if (c1.getNombre().equalsIgnoreCase(nombre)) {
		                        paraBorrar.add(c1);
		                    }
		                }

		                //Eliminas de la lista principal los que hayas añadido en la auxiliar
		                for (Cancion borrar : paraBorrar) {
		                    lstCancion.remove(borrar);
		                }
		                
		                System.out.println("\u001B[32mSe eliminó una Cancion de la lista.\u001B[0m");
		                
		            }
		   

		
		
		
		
	    //Metodo Adicionar Cancion
		public void adicionarCancion(Cancion c) {
			this.lstCancion.add(c);
		
		}
		

	//Metodo comparar edad : Recibe un humano y devuelve el nombre del que tenga mayor edad
		public String compararEdad(Humano h){
			if(this.fechaNacimiento.isBefore(h.getFechaNacimiento())){
		         return this.nombre; 
		         
			}else {
				 return h.getNombre();
			}
			
		}
	
	 

	
	
	
	

}
