package com.example.demo.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8883784531160907530L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id; 
	
	public String nombre;
	public String apellido;
	public Integer edad;
	public String password;

	@Column(name="fecha_creacion")
	@Temporal(TemporalType.DATE)
	public Date fechaCreacion;
	
	
	public Usuario() {
		super();
	}
	public Usuario(Long id, String nombre, String apellido, Integer edad, String password, Date fechaCreacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.password = password;
		this.fechaCreacion = fechaCreacion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
}
