/**
 * 
 */
package edu.unah.poo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import edu.unah.poo.model.InventarioPeces;
import edu.unah.poo.repository.RepositoryInventarioPeces;

/**
 * @author Tiffany
 *
 */
@Service
public class ServiceInventarioPeces {
	@Autowired
	RepositoryInventarioPeces repositoryInventarioPeces;
	
	
	public void  crearInventarioPeces (InventarioPeces inventarioPeces) {
		this.repositoryInventarioPeces.save(inventarioPeces);
	}
	
	
	
	
	public List <InventarioPeces> obtenerTodosInventarioPeces(){
		return this.repositoryInventarioPeces.findAll();
	}
	
	public InventarioPeces buscarInventario(int id) {
		return this.repositoryInventarioPeces.findById(id);
	}
	
}
