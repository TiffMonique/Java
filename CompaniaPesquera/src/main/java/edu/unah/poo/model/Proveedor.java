/**
 * 
 */
package edu.unah.poo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Tiffany
 *
 */

/*
 * create table proveedor(idProveedor int primary key, 
 * nombre varchar(50), telefono varchar(20));
 */

@Entity
@Table (name ="proveedor")

public class Proveedor {
	@Id
	private int idProveedor;
	private String nombre;
	private String telefono;
	
	@OneToMany(mappedBy="producto",fetch=FetchType.EAGER)
	private List<Producto> producto;
	
	
	public Proveedor (){};
	
	public Proveedor(int idProveedor, String nombre, String telefono) {
		super();
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
