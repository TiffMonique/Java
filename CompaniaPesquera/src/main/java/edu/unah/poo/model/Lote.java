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
 * create table lote(idLote int primary key ,estado varchar (20));	
 */
@Entity
@Table (name= "lote")
public class Lote {
	@Id
	private int idLote;
	private String estado;
	
	
	@OneToMany(mappedBy="Lote",fetch=FetchType.EAGER)
	private List<Limpieza> Limpiezas;
	
	@OneToMany(mappedBy="Lote",fetch=FetchType.EAGER)
	private List<Producto> productos;
	
	
	public Lote () {};
	
	



	public Lote(int idLote, String estado) {
		super();
		this.idLote = idLote;
		this.estado = estado;
		
	}





	public int getIdLote() {
		return idLote;
	}
	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
}
