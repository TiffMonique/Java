/**
 * 
 */
package edu.unah.poo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author Tiffany
 *
 */

/*
 * create table limpieza(idLimpieza int primary key, nLotesALimpiar int ,
						idEncargado int , empleadosAsig int , numEnlatados int, 
                        foreign Key(idEncargado) references empleado(idEmpleado)); 
 */
@Entity
@Table (name ="limpieza")
public class Limpieza {
	@Id
	private int idLimpieza;
	private int nLotesALimpiar;
	private int empleadosAsig;
	private int numEnlatados;
	
	@ManyToOne
	@JoinColumn(name = "idEmpleado")
	@JsonBackReference
	private Empleado idEncargado; //Hacer referencia a los empelados
	
	@ManyToOne
	@JoinColumn(name = "idLote")
	@JsonBackReference
	private Lote lote; //Hacer referencia a los lotes a limpiar
	
	
	
	public Limpieza () {};
	

	public Limpieza(int idLimpieza, int nLotesALimpiar, int empleadosAsig, int numEnlatados, Empleado idEncargado,
			Lote lote) {
		super();
		this.idLimpieza = idLimpieza;
		this.nLotesALimpiar = nLotesALimpiar;
		this.empleadosAsig = empleadosAsig;
		this.numEnlatados = numEnlatados;
		this.idEncargado = idEncargado;
		this.lote = lote;
	}




	public int getIdLimpieza() {
		return idLimpieza;
	}



	public void setIdLimpieza(int idLimpieza) {
		this.idLimpieza = idLimpieza;
	}



	public int getnLotesALimpiar() {
		return nLotesALimpiar;
	}



	public void setnLotesALimpiar(int nLotesALimpiar) {
		this.nLotesALimpiar = nLotesALimpiar;
	}




	public int getEmpleadosAsig() {
		return empleadosAsig;
	}



	public void setEmpleadosAsig(int empleadosAsig) {
		this.empleadosAsig = empleadosAsig;
	}



	public int getNumEnlatados() {
		return numEnlatados;
	}



	public void setNumEnlatados(int numEnlatados) {
		this.numEnlatados = numEnlatados;
	}
	
	

}
