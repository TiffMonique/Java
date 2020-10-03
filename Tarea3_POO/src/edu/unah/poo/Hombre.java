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

	
	


	

	


	
	
	
	
	/*
	 * public String compararEdad(Humano h , Humano h2) {
		
		//DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//LocalDate fechaNac = LocalDate.parse(this.getFechaNacimiento(), fmt);
		LocalDate fechaActual = LocalDate.now();

		Period periodo = Period.between(this.getFechaNacimiento(), fechaActual);
		System.out.printf("La edad es: %s años, %s meses y %s días",
		                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
		
		//ahora comparar los años de las dos fechas y asi obtener la edad
				int edad = fechaActual.getYear() - this.getFechaNacimiento().getYear();
				

				if(edad == edad2) {
					if(this.getFechaNacimiento().getMonths() > ){
						
						
					}
						
					
				}
	 * 
	 */
	
					
					
			/*
			 * Main
Humano  h = new Hombre(......);
Humano m = new Mujer(.....);

System.out.println(h.comparaEdad(m));


Clase Humano
public String compararEdad( Humano h){
	if(this.fechaNacimiento.isBefore(h.getFechaNacimiento())){
         return h.getNombre() } else this.nombre
}
		
			 */
				
				
/*
 * public String convertirFechaString(Date date) {
        return new SimpleDateFormat("dd-MM-yyyy ").format(date);
    }
--------- este es de fecha a string
 public java.util.Date stringToDate(String fechaString) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaResult = null;
        try {
            fechaResult = format.parse(fechaString);
            return fechaResult;
        } catch (ParseException ex) {
            System.out.println("Error " + ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    }

 */
		
		
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 *  public String convertirFechaString(Date date) {
        return new SimpleDateFormat("dd-MM-yyyy ").format(date);
    }
--------- este es de fecha a string
 public java.util.Date stringToDate(String fechaString) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaResult = null;
        try {
            fechaResult = format.parse(fechaString);
            return fechaResult;
        } catch (ParseException ex) {
            System.out.println("Error " + ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    }

		 * 
		 * 
		 * 
		 * 
		 * 		 * public boolean compararTitulo(String titulo, List<String> titulos) {
		 
		     boolean resultado= false;
		 	
		     for (int x=0; x<titulos.size(); x++) {
			      if(titulos.get(x).equals(titulo)) {
			    	  return true;
			      }
		     }
		
		   return resultado;
			
		}
		 //declarar una fecha de nacimiento
		LocalDate fechaNacimiento.of(1982, Month.June, 22);
		//crear fecha de hoy para comparar
		LocalDate fechaHoy = LocalDate.now();
		
		
		
		
		/*
		 *LocalDate.parse("2018-05-30")
		public boolean mantenimiento() {
			LocalDate fechaActual = LocalDate.now();
			Period periodo = Period.between(this.fechaMantenimiento, fechaActual);
			if(periodo.toTotalMonths() <= this.MesesMAntenimiento)
				return true;
			else
				return false;
		}
		 
		return null;
	}*/
	
	


	
	
	
	
	
	

}
