package com.prueba.org;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba.org.services.PersonaService;

@SpringBootTest
class EstadosPersonasApplicationTests {

	@Autowired
	private PersonaService service;
	
	@Test
	void contextLoads() {
		service.obtenerPersonas();
	}
}
