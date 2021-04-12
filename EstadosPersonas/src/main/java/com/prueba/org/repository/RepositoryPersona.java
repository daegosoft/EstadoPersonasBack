package com.prueba.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.org.entities.Persona;

@Repository
public interface RepositoryPersona extends JpaRepository<Persona, Long>{
	
	Persona findByUserName(String username);
}
