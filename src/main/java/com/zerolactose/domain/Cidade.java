package com.zerolactose.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cidade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@JoinColumn(name="cod_estado")
	private Integer estado;
	@OneToMany(mappedBy="cidade", fetch = FetchType.LAZY)
	private List<Estabelecimento> estabelecimento;
		
	public Cidade() {
		
	}

	public Cidade(Integer id, String nome, Integer estado, List<Estabelecimento> estabelecimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.estado = estado;
		this.estabelecimento = estabelecimento;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public List<Estabelecimento> getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(List<Estabelecimento> estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
}
