package com.prueba.org.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prueba.org.DTO.EstadoDTO;
import com.prueba.org.entities.Estado;
import com.prueba.org.repository.RepositoryEstado;

@Repository
public class EstadoService extends GeneralService{

	@Autowired RepositoryEstado repository;
	
	public EstadoDTO obtenerPorId(Long id) {
		return this.toTransferDTO(repository.findById(id).get());
	}
	
	public List<EstadoDTO> obtenerTodos(){
		List<Estado> estados = repository.findAll();
		List<EstadoDTO> estadosDTO = new ArrayList<EstadoDTO>(); 
		estados.stream().forEach(data -> estadosDTO.add(this.toTransferDTO(data)));
		return estadosDTO;
	}
	
	public EstadoDTO crearEstado(EstadoDTO estado) {
		return this.toTransferDTO(repository.save(this.toTransfer(estado)));
	}
	
	public EstadoDTO modificarEstado(EstadoDTO estado) {
		return this.toTransferDTO(repository.save(this.toTransfer(estado))); 
	}
	
	public void eliminarEstado(EstadoDTO estado) {
		repository.delete(this.toTransfer(estado));
	}
}
