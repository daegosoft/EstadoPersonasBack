package com.prueba.org.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prueba.org.DTO.TipoIdentificacionDTO;
import com.prueba.org.entities.TipoIdentificacion;
import com.prueba.org.repository.RepositoryTipoIdentifacion;

@Repository
public class TipoIdentificacionService extends GeneralService{
	
	@Autowired RepositoryTipoIdentifacion repository;
	
	public TipoIdentificacionDTO obtenerPorId(Long id) {
		return this.toTransferDTO(repository.findById(id).get());
	}
	
	public List<TipoIdentificacionDTO> obtenerTipos(){
		List<TipoIdentificacion> tipos = repository.findAll();
		List<TipoIdentificacionDTO> tiposDTO = new ArrayList<TipoIdentificacionDTO>(); 
		tipos.stream().forEach(data -> tiposDTO.add(this.toTransferDTO(data)));
		return tiposDTO;
	}
	
	public TipoIdentificacionDTO crearTipo(TipoIdentificacionDTO tipo) {
		return this.toTransferDTO(repository.save(this.toTransfer(tipo)));
	}
	
	public TipoIdentificacionDTO modificarTipo(TipoIdentificacionDTO tipo) {
		return this.toTransferDTO(repository.save(this.toTransfer(tipo))); 
	}
	
	public void eliminarTipo(TipoIdentificacionDTO tipo) {
		repository.delete(this.toTransfer(tipo));
	}

}
