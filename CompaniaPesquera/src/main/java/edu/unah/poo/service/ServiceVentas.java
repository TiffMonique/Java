/**
 * 
 */
package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Ventas;
import edu.unah.poo.repository.RepositoryVentas;



/**
 * @author Tiffany
 *
 */
@Service
public class ServiceVentas {
	@Autowired
	RepositoryVentas repositoryVentas;
	
	
	
	public void crearVenta (Ventas venta) {
		this.repositoryVentas.save(venta);
	}
	
	public List<Ventas> obtenerLimpiezas() {
		return this.repositoryVentas.findAll();
	}
	
	public Ventas buscarVentas(int id) {
		return this.repositoryVentas.findById(id);
	}

}
