package com.prueba.org.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name="nombre", nullable = false, length = 100)
	private String nombre;
	@Column(name="apellido", nullable = false, length = 100)
	private String apellido;
	@Column(name="fecha_nacimiento")
	private Timestamp fechaNacimiento;
	@Column(name="username", nullable=false, length = 20)
	private String userName;
	@Column(name="password", nullable=false, length = 20)
	private String password;
	@Column(name="identificacion", nullable = false)
	private Long identificacion;
	@OneToOne(targetEntity = TipoIdentificacion.class/*mappedBy="codigo_tipo_identificacion"*/)
	private TipoIdentificacion codigoTipoIdentificacion;
	@OneToOne(targetEntity = Estado.class)
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
