package com.prueba.org.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prueba.org.DTO.PersonaDTO;
import com.prueba.org.repository.RepositoryPersona;
import com.prueba.org.entities.Persona;

@Repository
public class PersonaService extends GeneralService{
	
	@Autowired RepositoryPersona repository;
	
	public PersonaDTO obtenerPorId(Long id) {
		return this.toTransferDTO(repository.findById(id).get());
	}
	
	public List<PersonaDTO> obtenerPersonas(){
		List<Persona> personas = repository.findAll();
		List<PersonaDTO> personasDTO = new ArrayList<PersonaDTO>(); 
		personas.stream().forEach(data -> personasDTO.add(this.toTransferDTO(data)));
		return personasDTO;
	}
	
	public PersonaDTO crearPersona(PersonaDTO persona) {
		return this.toTransferDTO(repository.save(this.toTransfer(persona)));
	}
	
	public PersonaDTO modificarPersona(PersonaDTO persona) {
		return this.toTransferDTO(repository.save(this.toTransfer(persona))); 
	}
	
	public boolean eliminarPersona(PersonaDTO persona) {
		repository.delete(this.toTransfer(persona));
		return repository.existsById(persona.getCodigo());
	}
}