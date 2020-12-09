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
 * create table inventarioPeces(id int primary key, nombre varchar(50), 
 * 								color varchar(20), tipoAgua varchar(20), 
								tamanioPromedio varchar (50));
 */

@Entity
@Table (name="inventarioPeces")

public class InventarioPeces {
	@Id
	private int id;
	private String nombre;
	private String color;
	private String tipoAgua;
	private String tamanioPromedio;
	
	@OneToMany(mappedBy="inventarioPeces",fetch=FetchType.EAGER)
	private List<Producto> producto;
	
	@OneToMany(mappedBy="inventarioPeces",fetch=FetchType.EAGER)
	private List<ProductoEnlatado> productoEnlatado;
	
	
	//Constructor por defecto
	public InventarioPeces() {}

	//Cosntructor
	public InventarioPeces(int id, String nombre, String color, String tipoAgua, String tamanioPromedio
			) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.tipoAgua = tipoAgua;
		this.tamanioPromedio = tamanioPromedio;
	}

	
	//Getters & Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public String getTamanioPromedio() {
		return tamanioPromedio;
	}

	public void setTamanioPromedio(String tamanioPromedio) {
		this.tamanioPromedio = tamanioPromedio;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}

	
	
	
	
	
	

	
	
	
	
	
	
	
}
