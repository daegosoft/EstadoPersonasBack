package com.prueba.org.services;

import com.prueba.org.DTO.*;
import com.prueba.org.entities.*;

public class GeneralService {
	
	public EstadoDTO toTransferDTO(Estado estado) {
		EstadoDTO e = new EstadoDTO();
		e.setCodigo(estado.getCodigo());
		e.setNombre(estado.getNombre());
		e.setFecha_creacion(estado.getFecha_creacion());
		e.setUsuario_creacion(estado.getUsuario_creacion());
		e.setFechaModificacion(estado.getFechaModificacion());
		e.setUsuario_modificaion(estado.getUsuario_modificacion());
		return e;
	}
	
	public Estado toTransfer(EstadoDTO estado) {
		Estado e = new Estado();
		e.setCodigo(estado.getCodigo());
		e.setNombre(estado.getNombre());
		e.setFecha_creacion(estado.getFecha_creacion());
		e.setUsuario_creacion(estado.getUsuario_creacion());
		e.setFechaModificacion(estado.getFechaModificacion());
		e.setUsuario_modificacion(estado.getUsuario_modificacion());
		return e;
	}
	
	public TipoIdentificacionDTO toTransferDTO(TipoIdentificacion tipo) {
		TipoIdentificacionDTO e = new TipoIdentificacionDTO();
		e.setCodigo(tipo.getCodigo());
		e.setNombre(tipo.getNombre());
		e.setFecha_creacion(tipo.getFecha_creacion());
		e.setUsuario_creacion(tipo.getUsuario_creacion());
		e.setFechaModificacion(tipo.getFechaModificacion());
		e.setUsuario_modificacion(tipo.getUsuario_modificacion());
		return e;
	}
	
	public TipoIdentificacion toTransfer(TipoIdentificacionDTO tipo) {
		TipoIdentificacion e = new TipoIdentificacion();
		e.setCodigo(tipo.getCodigo());
		e.setNombre(tipo.getNombre());
		e.setFecha_creacion(tipo.getFecha_creacion());
		e.setUsuario_creacion(tipo.getUsuario_creacion());
		e.setFechaModificacion(tipo.getFechaModificacion());
		e.setUsuario_modificacion(tipo.getUsuario_modificacion());
		return e;
	}
	
	public PersonaDTO toTransferDTO(Persona persona) {
		PersonaDTO p = new PersonaDTO();
		p.setCodigo(persona.getCodigo());
		p.setNombre(persona.getNombre());
		p.setApellido(persona.getApellido());
		p.setFechaNacimiento(persona.getFechaNacimiento());
		p.setUserName(persona.getUserName());
		p.setPassword(persona.getPassword());
		p.setCodigoTipoIdentificacion(persona.getCodigoTipoIdentificacion());
		p.setCodigoEstado(persona.getCodigoEstado());
		return p;
	}
	
	public Persona toTransfer(PersonaDTO persona) {
		Persona p = new Persona();
		p.setCodigo(persona.getCodigo());
		p.setNombre(persona.getNombre());
		p.setApellido(persona.getApellido());
		p.setFechaNacimiento(persona.getFechaNacimiento());
		p.setUserName(persona.getUserName());
		p.setPassword(persona.getPassword());
		p.setCodigoTipoIdentificacion(persona.getCodigoTipoIdentificacion());
		p.setCodigoEstado(persona.getCodigoEstado());
		return p;
	}

}
