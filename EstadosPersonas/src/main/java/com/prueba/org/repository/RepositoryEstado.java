package com.prueba.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.org.entities.Estado;

@Repository
public interface RepositoryEstado extends JpaRepository<Estado, Long>{
	
}
