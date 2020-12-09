/**
 * 
 */
package edu.unah.poo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author Tiffany
 *
 */

/*
 * create table ProductoEnlatado (idProducto int primary key, tipoPezEnlatado int  , 
 * 		 cantLatas int
         precio double, descripcion varchar(50), 
         foreign key(tipoPezEnlatado) references inventarioPeces(id));
 */
@Entity
@Table (name ="ProductoEnlatado")
public class ProductoEnlatado {
	@Id
	private int idProducto;
	private int cantLatas;
	private double precio;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "id")
	@JsonBackReference
	private InventarioPeces tipoPezEnlatado;
	
	@OneToMany(mappedBy="cliente",fetch=FetchType.EAGER)
	private List<Ventas> ventas;
	
	
	public ProductoEnlatado() {};

	public ProductoEnlatado(int idProducto, int cantLatas, double precio, String descripcion,
			InventarioPeces tipoPezEnlatado) {
		super();
		this.idProducto = idProducto;
		this.cantLatas = cantLatas;
		this.precio = precio;
		this.descripcion = descripcion;
		this.tipoPezEnlatado = tipoPezEnlatado;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantLatas() {
		return cantLatas;
	}

	public void setCantLatas(int cantLatas) {
		this.cantLatas = cantLatas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public InventarioPeces getTipoPezEnlatado() {
		return tipoPezEnlatado;
	}

	public void setTipoPezEnlatado(InventarioPeces tipoPezEnlatado) {
		this.tipoPezEnlatado = tipoPezEnlatado;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
