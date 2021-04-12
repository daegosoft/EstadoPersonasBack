package com.prueba.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.org.DTO.PersonaDTO;
import com.prueba.org.DTO.Respuesta;
import com.prueba.org.services.PersonaService;

@PreAuthorize("authenticated")
@RestController
@RequestMapping("/persona")
@CrossOrigin("{*}")
public class PersonaController extends ControllerRest{
	
	@Autowired PersonaService service;
	Respuesta respuesta;
	
	@GetMapping
	public ResponseEntity<PersonaDTO> obtenerPorId(@RequestParam(name="id") Long id) {
		return ResponseEntity.ok(service.obtenerPorId(id));
	}
	
	@PostMapping
	public ResponseEntity<List<PersonaDTO>> obtenerPersonas(){
		return ResponseEntity.ok(service.obtenerPersonas());
	}
	
	@PostMapping("/save")
	public ResponseEntity<Respuesta> crearPersona(@RequestBody PersonaDTO persona) {
		PersonaDTO p = service.crearPersona(persona);
		respuesta = new Respuesta();
		if(p != null) {
			respuesta.setRespuesta("Persona Guardado Exitosamente.");
		}else {
			respuesta.setRespuesta("Error Guardando Persona.");
		}
		return ResponseEntity.ok(respuesta);
	}
	
	@PutMapping
	public ResponseEntity<Respuesta> modificarPersona(@RequestBody PersonaDTO persona) {
		PersonaDTO p = service.modificarPersona(persona);
		respuesta = new Respuesta();
		if(p != null) {
			respuesta.setRespuesta("Persona Modificado Exitosamente.");
		}else {
			respuesta.setRespuesta("Error Modificando Persona.");
		}
		return ResponseEntity.ok(respuesta);
	}
	
	@DeleteMapping
	public ResponseEntity<Respuesta> eliminarPersona(@RequestBody PersonaDTO persona) {
		respuesta = new Respuesta();
		if(service.eliminarPersona(persona)) {
			respuesta.setRespuesta("Persona Eliminada Exitosamente.");
		}else {
			respuesta.setRespuesta("Error Eliminando Persona.");
		}
		return ResponseEntity.ok(respuesta);
	}
}
