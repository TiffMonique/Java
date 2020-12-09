/**
 * 
 */
package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Limpieza;
import edu.unah.poo.repository.RepositoryLimpieza;

/**
 * @author Tiffany
 *
 */
@Service
public class ServiceLimpieza {
	
	
	@Autowired
	RepositoryLimpieza repositoryLimpieza;
	
	
	
	public void crearLimpieza (Limpieza limpieza) {
		this.repositoryLimpieza.save(limpieza);
		
	}
	
	
	
	public List<Limpieza> obtenerLimpiezas() {
		return this.repositoryLimpieza.findAll();
	}
	
	public Limpieza buscarLimpieza(int id) {
		return this.repositoryLimpieza.findById(id);
	}
	
	

}
