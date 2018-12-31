package com.zerolactose.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Categoria implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;

//	@OneToMany(mappedBy="categoria", fetch = FetchType.LAZY)
//	private List<Alimento> alimentos;

	@ManyToMany
	@JoinTable(name="categoria_estabelecimento", 
		joinColumns= {@JoinColumn(name="id_categoria")}, 
		inverseJoinColumns={@JoinColumn(name="id_estabelecimento")})
	private List<Estabelecimento> estabelecimentos;
	@ManyToMany
	@JoinTable(name="categoria_receitas",
			joinColumns= {@JoinColumn(name="id_categoria")},
			inverseJoinColumns= {@JoinColumn(name="id_receita")})
	private List<Receita> receitas;
	private String foto;
	
	public Categoria() {
		
	}
	
	public Categoria(Integer id, String nome, List<Alimento> alimentos, String foto, 
			List<Estabelecimento> estabelecimentos, List<Receita> receitas) {
		super();
		this.id = id;
		this.nome = nome;
		//this.alimentos = alimentos;
		this.foto = foto;
		this.estabelecimentos = estabelecimentos;
		this.receitas = receitas;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
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

//	public List<Alimento> getAlimentos() {
//		return alimentos;
//	}
//
//	public void setAlimentos(List<Alimento> alimentos) {
//		this.alimentos = alimentos;
//	}

	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}

	public List<Receita> getReceitas() {
		return receitas;
	}

	public void setReceitas(List<Receita> receitas) {
		this.receitas = receitas;
	}
}
