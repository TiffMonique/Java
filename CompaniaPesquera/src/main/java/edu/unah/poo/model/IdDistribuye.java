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
/*
 *  create table distribuye(idProveedor int, idProducto int , primary key (idProveedor , idProducto),
						foreign key(idProveedor) references proveedor(idProveedor),
                        foreign key(idProducto) references producto (idProducto));
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Embeddable
public class IdDistribuye implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int idProveedor;
	private int idProducto;
	private LocalDate fecha;
	
	
	
	

	public IdDistribuye(int idProveedor, int idProducto, LocalDate fecha) {
		super();
		this.idProveedor = idProveedor;
		this.idProducto = idProducto;
		this.fecha = fecha;
	}



	public int hashCode() {
		return (int) this.idProveedor+this.idProducto;
	}
	

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IdDistribuye) { //Si el objeto es una instancia --> instanceof 
			IdDistribuye tmpid = (IdDistribuye)obj;
			if(this.idProveedor == tmpid.getIdProveedor()
				&& this.idProducto == tmpid.getIdProducto()) {
				return true;
			}else 
				return false;
		}else return false; //En caso de que no sea de la misma instancia
		
	}



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
