/**
 * 
 */
package edu.unah.poo.model;

import java.time.LocalDate;
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
 * create table empleado(idEmpleado int primary key , nombre varchar(50) ,telefono varchar(20), direccion varchar (50), 
						fechaContrato date , fechaNac date , puesto varchar (50));
 */
@Entity
@Table (name = "empleado")

public class Empleado {
	@Id
	private int idEmpleado;
	private String nombre;
	private String telefono;
	private String direccion;
	private LocalDate fechaContrato;
	private LocalDate fechaNac;
	private String puesto;
	
	@OneToMany(mappedBy="empleado",fetch=FetchType.EAGER)
	private List<Limpieza> limpieza;
	
	@OneToMany(mappedBy="empleado",fetch=FetchType.EAGER)
	private List<Ventas> ventas;
	
	
	public Empleado () {};
	
	
	public Empleado(int idEmpleado, String nombre, String telefono, String direccion, LocalDate fechaContrato, LocalDate fechaNac,
			String puesto) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.fechaContrato = fechaContrato;
		this.fechaNac = fechaNac;
		this.puesto = puesto;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public LocalDate getFechaContrato() {
		return fechaContrato;
	}
	public void setFechaContrato(LocalDate fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
	
	
	

}
