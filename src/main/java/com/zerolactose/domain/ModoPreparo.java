package com.zerolactose.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class ModoPreparo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String txt;
	@JoinColumn(name="cod_receita")
	private Integer modoPreparo;
	
	public ModoPreparo() {
		
	}
	
	public ModoPreparo(Integer id, String txt) {
		super();
		this.id = id;
		this.txt = txt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public Integer getModoPreparo() {
		return modoPreparo;
	}

	public void setModoPreparo(Integer modoPreparo) {
		this.modoPreparo = modoPreparo;
	}
	
}
