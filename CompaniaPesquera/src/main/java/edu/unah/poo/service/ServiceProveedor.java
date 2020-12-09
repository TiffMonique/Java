/**
 * 
 */
package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Proveedor;
import edu.unah.poo.repository.RepositoryProveedor;


/**
 * @author Tiffany
 *
 */
@Service
public class ServiceProveedor {
	@Autowired
	RepositoryProveedor repositoryProveedor;
	
	
	
	public void crearProveedor (Proveedor proveedor) {
		this.repositoryProveedor.save(proveedor);
		
	}
	
	
	
	public List<Proveedor> obtenerProveedores() {
		return this.repositoryProveedor.findAll();
	}
	
	public Proveedor buscarProveedor(int id) {
		return this.repositoryProveedor.findById(id);
	}

}
