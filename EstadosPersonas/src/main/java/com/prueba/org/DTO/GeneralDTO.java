package com.prueba.org.DTO;

import java.sql.Timestamp;

import com.prueba.org.annotations.Enlace;

public class GeneralDTO {
	
	@Enlace(name="codigo")
	protected Long codigo;
	@Enlace(name="codigo")
	protected String nombre;
	@Enlace(name="codigo")
	protected Timestamp fecha_creacion;
	@Enlace(name="codigo")
	protected Long usuario_creacion;
	@Enlace(name="codigo")
	protected Timestamp fechaModificacion;
	@Enlace(name="usuario_modificacion")
	protected Long usuario_modificacion;
}
