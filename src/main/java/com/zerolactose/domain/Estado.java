package com.zerolactose.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estado implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	@Column(name="Sigla")
	private String sigla;
	@Column(name="Nome")
	private String nome;
	@OneToMany(mappedBy="estado", fetch = FetchType.LAZY)
	private List<Cidade> cidade;
	
	public Estado(Integer id, String sigla, String nome, List<Cidade> cidade) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
		this.cidade = cidade;
	}

	public Estado() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Cidade> getCidade() {
		return cidade;
	}
	public void setCidade(List<Cidade> cidade) {
		this.cidade = cidade;
	}
}
