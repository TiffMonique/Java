/**
 * 
 */
package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.poo.model.ProductoEnlatado;

/**
 * @author Tiffany
 *
 */
public interface RepositoryProductoEnlatado extends JpaRepository<ProductoEnlatado, Integer>{
	public ProductoEnlatado findById(int Id);
}
