package com.zerolactose.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Ingrediente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String txt;
	@JoinColumn(name="cod_ingredientes")
	private Integer ingredientes;
	
	public Ingrediente() {
		
	}

	public Ingrediente(Integer id, String txt, Integer receita) {
		super();
		this.id = id;
		this.txt = txt;
		this.ingredientes = receita;
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

	public Integer getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Integer ingredientes) {
		this.ingredientes = ingredientes;
	}

}
