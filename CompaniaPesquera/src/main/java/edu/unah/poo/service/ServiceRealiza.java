/**
 * 
 */
package edu.unah.poo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.IdRealiza;

import edu.unah.poo.model.Realiza;

import edu.unah.poo.repository.RepositoryRealiza;

/**
 * @author Tiffany
 *
 */
@Service
public class ServiceRealiza {
	@Autowired 
	RepositoryRealiza repositoryRealiza;
	
	public void crearRealiza(Realiza realiza) {
		this.repositoryRealiza.save(realiza);
	}
	
	public Realiza buscarRealiza(IdRealiza realizaId) {
		return this.repositoryRealiza.getOne(realizaId);
	}
	
	public List<Realiza> obtenerTodasRealiza(){
		return this.repositoryRealiza.findAll();
	}

}
