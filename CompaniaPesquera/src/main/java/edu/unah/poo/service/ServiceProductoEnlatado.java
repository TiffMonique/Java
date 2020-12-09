/**
 * 
 */
package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.ProductoEnlatado;
import edu.unah.poo.repository.RepositoryProductoEnlatado;

/**
 * @author Tiffany
 *
 */

@Service
public class ServiceProductoEnlatado {
	@Autowired
	RepositoryProductoEnlatado repositoryProductoEnlatado;
	
	
	
	public void crearProductoEnlatado (ProductoEnlatado productoEnlatado) {
		this.repositoryProductoEnlatado.save(productoEnlatado);
		
	}
	
	
	
	public List<ProductoEnlatado> obtenerProductoEnlatado() {
		return this.repositoryProductoEnlatado.findAll();
	}
	
	public ProductoEnlatado buscarProductoEnlatado(int id) {
		return this.repositoryProductoEnlatado.findById(id);
	}
	
}
