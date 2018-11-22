package com.zerolactose.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Receita implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String por;
	private String descricao;
	private String rendimento;
	private String preparo;
	private String image;
	@OneToMany(mappedBy="ingredientes", fetch = FetchType.LAZY)
	private List<Ingrediente> ingredientes;
	@OneToMany(mappedBy="modoPreparo", fetch = FetchType.LAZY)
	private List<ModoPreparo> modoPreparo;
	
	public Receita() {
		
	}
	
	public Receita(Integer id, String nome, String por, String descricao, String rebdimento, String preparo,
			String image, List<Ingrediente> ingredientes, List<ModoPreparo> modoPreparo) {
		super();
		this.id = id;
		this.nome = nome;
		this.por = por;
		this.descricao = descricao;
		this.rendimento = rebdimento;
		this.preparo = preparo;
		this.image = image;
		this.ingredientes = ingredientes;
		this.modoPreparo = modoPreparo;
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
	public String getPor() {
		return por;
	}
	public void setPor(String por) {
		this.por = por;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getRendimento() {
		return rendimento;
	}
	public void setRendimento(String rebdimento) {
		this.rendimento = rebdimento;
	}
	public String getPreparo() {
		return preparo;
	}
	public void setPreparo(String preparo) {
		this.preparo = preparo;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public List<ModoPreparo> getModoPreparo() {
		return modoPreparo;
	}
	public void setModoPreparo(List<ModoPreparo> modoPreparo) {
		this.modoPreparo = modoPreparo;
	}
	
}
