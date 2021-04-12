package com.prueba.org.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.prueba.org.entities.Persona;
import com.prueba.org.security.JWTService;

public class ControllerRest {
	
	@Autowired JWTService jwtService;
	
	private String jwtToken;
	private Persona persona;
	
	/*@Autowired
	public ControllerRest() {
		this.jwtToken = this.jwtService.getJWTToken(persona.getUserName());
	}*/
}
