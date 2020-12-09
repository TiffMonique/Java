/**
 * 
 */
package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.unah.poo.model.Ventas;

/**
 * @author Tiffany
 *
 */
public interface RepositoryVentas extends JpaRepository <Ventas, Integer>{
	public Ventas findById(int Id);
}
