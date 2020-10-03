package edu.unah.poo;

public interface ComportamientoHumano {
	
	public void estudiar();
	public String compararEdad(Humano h);
	public void trabajar();
	public void listarCanciones();
	public void adicionarCancion(Cancion c);
	public void buscarCancion(String nombre);
	public void eliminarCancion(String nombre);

}
