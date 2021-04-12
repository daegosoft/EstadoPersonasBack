package com.prueba.org.DTO;

import java.sql.Timestamp;

public class TipoIdentificacionDTO extends GeneralDTO{
	
	public TipoIdentificacionDTO() {
		super();
	}
	
	public Long getCodigo() {
		return this.codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Timestamp getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Timestamp fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	
	public Long getUsuario_creacion() {
		return usuario_creacion;
	}
	public void setUsuario_creacion(Long usuario_creacion) {
		this.usuario_creacion = usuario_creacion;
	}
	
	public Timestamp getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Timestamp fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public Long getUsuario_modificacion() {
		return this.usuario_modificacion;
	}
	public void setUsuario_modificacion(Long usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}
}
