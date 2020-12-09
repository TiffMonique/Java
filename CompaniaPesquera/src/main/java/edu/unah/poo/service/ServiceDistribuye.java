/**
 * 
 */
package edu.unah.poo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.poo.model.Distribuye;
import edu.unah.poo.model.IdDistribuye;

import edu.unah.poo.repository.RepositoryDistribuye;


/**
 * @author Tiffany
 *
 */
@Service
public class ServiceDistribuye {
	@Autowired 
	RepositoryDistribuye repositoryDistribuye;
	
	public void crearDistribucion(Distribuye distribuye) {
		this.repositoryDistribuye.save(distribuye);
	}
	
	public Distribuye buscarDistribucion(IdDistribuye distribuyeId) {
		return this.repositoryDistribuye.getOne(distribuyeId);
	}
	
	public List<Distribuye> obtenerTodasDistribucion(){
		return this.repositoryDistribuye.findAll();
	}
	

}
