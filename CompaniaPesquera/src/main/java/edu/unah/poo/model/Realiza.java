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
 * create table realiza(idLimpieza int, idEmpleado int, fecha date, horaInicio varchar (20) , horaFinal varchar(20),
                     primary key(idLimpieza , idEmpleado, fecha) , foreign key(idLimpieza) references limpieza(idLimpieza),
                     foreign key(idEmpleado) references empleado(idEmpleado));
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table (name="realiza")
@IdClass(IdRealiza.class)

public class Realiza {
	@Id
	private int idLimpieza;
	@Id
	private int idEmpleado;
	@Id
	private LocalDate fecha;
	private String horaInicio;
	private String horaFinal;
	



	public Realiza(int idLimpieza, int idEmpleado, LocalDate fecha, String horaInicio, String horaFinal,
			Limpieza limpieza, Empleado empleado) {
		super();
		this.idLimpieza = idLimpieza;
		this.idEmpleado = idEmpleado;
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFinal = horaFinal;
		this.limpieza = limpieza;
		this.empleado = empleado;
	}

	@ManyToOne
	@JoinColumn(name="idLimpieza", referencedColumnName="idLimpieza", insertable = false, updatable = false)
	@JsonBackReference
	private Limpieza limpieza;
	
	
	@ManyToOne
	@JoinColumn(name="idEmpleado", referencedColumnName="idEmpleado", insertable = false, updatable = false)
	@JsonBackReference
	private Empleado empleado;
	
	public int getIdLimpieza() {
		return idLimpieza;
	}

	public void setIdLimpieza(int idLimpieza) {
		this.idLimpieza = idLimpieza;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}
	

}
