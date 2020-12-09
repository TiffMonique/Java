/**
 * 
 */
package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.unah.poo.model.Lote;
import edu.unah.poo.repository.RepositoryLote;

/**
 * @author Tiffany
 *
 */
@Service
public class ServiceLote {
	@Autowired
	RepositoryLote repositoryLote;
	
	
	
	public void crearLote (Lote lote) {
		this.repositoryLote.save(lote);
		
	}
	
	
	
	public List<Lote> obtenerLotes() {
		return this.repositoryLote.findAll();
	}
	
	public Lote buscarLote(int id) {
		return this.repositoryLote.findById(id);
	}
}
