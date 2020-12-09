/**
 * 
 */
package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Producto;
import edu.unah.poo.repository.RepositoryProducto;


/**
 * @author Tiffany
 *
 */@Service
public class ServiceProducto {
		@Autowired
		RepositoryProducto repositoryProducto;
		
		
		
		public void crearProducto (Producto producto) {
			this.repositoryProducto.save(producto);
			
		}
		
		
		
		public List<Producto> obtenerProductos() {
			return this.repositoryProducto.findAll();
		}
		
		public Producto buscarProducto(int id) {
			return this.repositoryProducto.findById(id);
		}

}
