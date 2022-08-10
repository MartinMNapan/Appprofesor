package pe.idat.edu.service;

import java.util.List;

import pe.idat.edu.model.Profesor;

public interface ProfesorService {
	
	List<Profesor> listar();
	void guardar(Profesor profesor);

	
	

}
