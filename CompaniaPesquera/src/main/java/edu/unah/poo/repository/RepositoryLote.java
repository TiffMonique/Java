/**
 * 
 */
package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.poo.model.Lote;

/**
 * @author Tiffany
 *
 */
public interface RepositoryLote extends JpaRepository <Lote, Integer> {
		public Lote findById(int Id);
}
