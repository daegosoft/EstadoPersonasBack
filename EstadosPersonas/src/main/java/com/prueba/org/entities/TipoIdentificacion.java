package com.prueba.org.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_identificacion")
public class TipoIdentificacion extends General{
	
	public TipoIdentificacion() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCodigo() {
		return this.codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	@Column(name="nombre", nullable = false, length=20)
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(name="fecha_creacion")
	public Timestamp getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Timestamp fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	@Column(name="usuario_creacion")
	public Long getUsuario_creacion() {
		return usuario_creacion;
	}
	public void setUsuario_creacion(Long usuario_creacion) {
		this.usuario_creacion = usuario_creacion;
	}
	@Column(name="fecha_modificacion")
	public Timestamp getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Timestamp fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	@Column(name="usuario_modificacion")
	public Long getUsuario_modificacion() {
		return this.usuario_modificacion;
	}
	public void setUsuario_modificacion(Long usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}
}