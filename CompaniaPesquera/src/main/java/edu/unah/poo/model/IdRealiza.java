/**
 * 
 */
package edu.unah.poo.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Tiffany
 *
 */

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Embeddable
public class IdRealiza implements Serializable{
	private static final long serialVersionUID = 1L;
	private int idLimpieza;
	private int idEmpleado;
	private LocalDate fecha;
	

	public IdRealiza(int idLimpieza, int idEmpleado, LocalDate fecha) {
		super();
		this.idLimpieza = idLimpieza;
		this.idEmpleado = idEmpleado;
		this.fecha = fecha;
	}
	

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IdRealiza) { //Si el objeto es una instancia --> instanceof 
			IdRealiza tmpid = (IdRealiza)obj;
			if(this.idLimpieza == tmpid.getIdLimpieza()
				&& this.idEmpleado == tmpid.getIdEmpleado()
				&& this.fecha.compareTo(tmpid.getFecha())==0) {
				return true;
			}else 
				return false;
		}else return false; //En caso de que no sea de la misma instancia
		
	}
	
	
	public int hashCode() {
		return (int) this.fecha.hashCode()+this.idLimpieza+this.idEmpleado;
	}
	
	




	public int getIdLimpieza() {
		return idLimpieza;
	}


	public void setIdLimpieza(int idLimpieza) {
		this.idLimpieza = idLimpieza;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
	

}
