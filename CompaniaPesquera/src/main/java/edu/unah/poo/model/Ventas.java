/**
 * 
 */
package edu.unah.poo.model;

import java.time.LocalDate;

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
 * create table ventas (idventa int primary key , lugarVenta varchar (50), fecha date, tipoProducto int ,
						cantidad int , precio double, idEmpleado int,
                        foreign key (tipoProducto) references ProductoEnlatado (idProducto),
                        foreign key (idEmpleado) references empleado(idEmpleado));
 */
@Entity
@Table (name="ventas")
public class Ventas {
	@Id
	private int idventa;
	private String lugarVenta;
	private LocalDate fecha;
	private int cantidad;
	private double precio;
	
	@ManyToOne
	@JoinColumn(name = "idProducto")
	@JsonBackReference
	private ProductoEnlatado tipoProducto;//Hace referencia al tipo de producto enlatdo
	
	@ManyToOne
	@JoinColumn(name = "idEmpleado")
	@JsonBackReference
	private Empleado empleado;
	
	

	public Ventas(int idventa, String lugarVenta, LocalDate fecha, int cantidad, double precio,
			ProductoEnlatado tipoProducto, Empleado empleado) {
		super();
		this.idventa = idventa;
		this.lugarVenta = lugarVenta;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.precio = precio;
		this.tipoProducto = tipoProducto;
		this.empleado = empleado;
	}

	public int getIdventa() {
		return idventa;
	}

	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}

	public String getLugarVenta() {
		return lugarVenta;
	}

	public void setLugarVenta(String lugarVenta) {
		this.lugarVenta = lugarVenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ProductoEnlatado getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(ProductoEnlatado tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	
	
	

}
