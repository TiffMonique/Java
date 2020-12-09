/**
 * 
 */
package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.poo.model.Limpieza;

/**
 * @author Tiffany
 *
 */
public interface RepositoryLimpieza extends JpaRepository <Limpieza, Integer>{
		public Limpieza findById(int Id);
}
