package com.bezkoder.spring.mssql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the v_RepFE database table.
 * 
 */
/**
 * @author BP	:	DEVJAVA02
 */
@Entity
@Table(name = "TC_GRUPOS_DISCRIMINADOS")
public class TcGruposDiscriminados{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOMBRE")
	  private String nombre;

	@Column(name = "ESTATUS")
	private Boolean estatus;
	
	public TcGruposDiscriminados() {}
	
	 public TcGruposDiscriminados(Integer id) {
		 this.id=id;
	 }
	 
	 public Integer getIdGruposDiscriminados() {
		 return id;
	 }
	 
	 public void setIdGruposDiscriminados(Integer id) {
		 this.id=id;
	 }
	 
	 public String getNombre() {
		 return nombre;
	 }
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	} 
	
	public boolean getEstatus () {
		return this.estatus;
	}
	
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
}
