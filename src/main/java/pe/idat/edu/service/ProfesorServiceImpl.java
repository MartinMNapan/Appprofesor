package pe.idat.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.model.Profesor;
import pe.idat.edu.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {
	
	@Autowired
	private ProfesorRepository repository;

	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void guardar(Profesor profesor) {
		// TODO Auto-generated method stub
		repository.save(profesor);

	}

}
