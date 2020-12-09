/**
 * 
 */
package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.poo.model.Producto;

/**
 * @author Tiffany
 *
 */

public interface RepositoryProducto extends JpaRepository <Producto, Integer>{
	public Producto findById(int Id);
	
}
