/**
 * 
 */
package edu.unah.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.unah.poo.model.IdRealiza;
import edu.unah.poo.model.Realiza;

/**
 * @author Tiffany
 *
 */

public interface RepositoryRealiza extends JpaRepository <Realiza, IdRealiza>{
	public Realiza findById(int id);
}
