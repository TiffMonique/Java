/**
 * 
 */
package edu.unah.poo.model;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Tiffany
 *
 */

/*
 * create table distribuye(idProveedor int, idProducto int , primary key (idProveedor , 
 * 						idProducto),
						foreign key(idProveedor) references proveedor(idProveedor),
                        foreign key(idProducto) references producto (idProducto));
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table (name="distribuye")
@IdClass(IdDistribuye.class)

public class Distribuye {
	@Id
	private int idProveedor;
	@Id
	private int idProducto;
	private LocalDate fecha;
	
	
	public Distribuye () {};
	
	


	
	public Distribuye(int idProveedor, int idProducto, LocalDate fecha, Producto producto, Proveedor proveedor) {
		super();
		this.idProveedor = idProveedor;
		this.idProducto = idProducto;
		this.fecha = fecha;
		this.producto = producto;
		this.proveedor = proveedor;
	}





	@ManyToOne
	@JoinColumn(name="idProducto", referencedColumnName="idProducto", insertable = false, updatable = false)
	@JsonBackReference
	private  Producto producto;
	
	
	@ManyToOne
	@JoinColumn(name="idProveedor", referencedColumnName="idProveedor", insertable = false, updatable = false)
	@JsonBackReference
	private  Proveedor proveedor;


	public int getIdProveedor() {
		return idProveedor;
	}


	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}


	public int getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	

}
