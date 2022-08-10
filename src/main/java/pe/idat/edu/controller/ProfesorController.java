package pe.idat.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.idat.edu.model.Profesor;
import pe.idat.edu.service.ProfesorService;

@Controller
@RequestMapping(path = "/api/profesor/v1")
public class ProfesorController {
	
	
	@Autowired
	private ProfesorService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Profesor> listar(){
		return service.listar();
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Profesor profesor) {
		service.guardar(profesor);	
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
