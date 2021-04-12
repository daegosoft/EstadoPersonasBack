package com.prueba.org.DTO;

import java.sql.Timestamp;

import com.prueba.org.entities.Estado;
import com.prueba.org.entities.TipoIdentificacion;

public class PersonaDTO {
	private Long codigo;
	private String nombre;
	private String apellido;
	private Timestamp fechaNacimiento;
	private String userName;
	private String password;
	private Long identificacion;
	private TipoIdentificacion codigoTipoIdentificacion;
	private Estado codigoEstado;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Timestamp getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Timestamp fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}
	public TipoIdentificacion getCodigoTipoIdentificacion() {
		return codigoTipoIdentificacion;
	}
	public void setCodigoTipoIdentificacion(TipoIdentificacion codigoTipoIdentificacion) {
		this.codigoTipoIdentificacion = codigoTipoIdentificacion;
	}
	public Estado getCodigoEstado() {
		return codigoEstado;
	}
	public void setCodigoEstado(Estado codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

}
