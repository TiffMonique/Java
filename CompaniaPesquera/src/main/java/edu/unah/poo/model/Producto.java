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
 *  
(idProducto int ,  indiceCalidad int, pesoGlobal double, precioxK double,
                        numLote int ,foreign key(numLote) references lote(idLote), proveedor int,
                 
                        primary key (idProducto) ,  foreign key(idProducto) references InventarioPeces(id));
 */

@Entity
@Table (name="producto")
public class Producto {
	@Id
	private int idProducto;
	private int indiceCalidad;
	private double pesoGlobal;
	private double precioxK;
	
	
	@ManyToOne
	@JoinColumn(name = "idLote")
	@JsonBackReference
	private Lote numLote;
	
	@ManyToOne
	@JoinColumn(name = "id")
	@JsonBackReference
	private InventarioPeces productoInventario;
	
	
	


	
	public Producto() {};
	
	

	public Producto(int idProducto, int indiceCalidad, double pesoGlobal, double precioxK, Lote numLote,
			InventarioPeces productoInventario) {
		super();
		this.idProducto = idProducto;
		this.indiceCalidad = indiceCalidad;
		this.pesoGlobal = pesoGlobal;
		this.precioxK = precioxK;
		this.numLote = numLote;
		this.productoInventario = productoInventario;
	}



	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public int getIndiceCalidad() {
		return indiceCalidad;
	}


	public void setIndiceCalidad(int indiceCalidad) {
		this.indiceCalidad = indiceCalidad;
	}


	public double getPesoGlobal() {
		return pesoGlobal;
	}


	public void setPesoGlobal(double pesoGlobal) {
		this.pesoGlobal = pesoGlobal;
	}


	public double getPrecioxK() {
		return precioxK;
	}


	public void setPrecioxK(double precioxK) {
		this.precioxK = precioxK;
	}
	
	

}
