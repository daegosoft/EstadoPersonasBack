package com.prueba.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.org.entities.TipoIdentificacion;

@Repository
public interface RepositoryTipoIdentifacion extends JpaRepository<TipoIdentificacion, Long>{

}
