package com.zerolactose.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.zerolactose.services.AlimentoService;

@Entity
public class Estabelecimento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;
	private String foto;
	private String endereco;
	private Integer estado;
	private String telefone;
	private Double latitude;
	private Double longitude;
	private Boolean status;
	@JoinColumn(name="cod_cidade")
	private Integer cidade;
	@Column(name="cidade_desc")
	private String cidadeDesc;
	@Column(name="estado_desc")
	private String estadoDesc;
	@ManyToMany
	@JoinTable(name="estabelecimento_alimentos", 
	joinColumns={@JoinColumn(name="id_estabelecimento")}, 
	inverseJoinColumns={@JoinColumn(name="id_alimento")}
	)
	private List<Alimento> alimentos;
	
	public Estabelecimento() {
		
	}

	public Estabelecimento(Integer id, String nome, String descricao, String foto, String endereco, Integer estado,
			String telefone, Double latitude, Double longitude, Boolean status, Integer cidade, String cidadeDesc,
			String estadoDesc, List<Alimento> alimentos) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.foto = foto;
		this.endereco = endereco;
		this.estado = estado;
		this.telefone = telefone;
		this.latitude = latitude;
		this.longitude = longitude;
		this.status = status;
		this.cidade = cidade;
		this.cidadeDesc = cidadeDesc;
		this.estadoDesc = estadoDesc;
		this.alimentos = alimentos;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getCidade() {
		return cidade;
	}

	public void setCidade(Integer cidade) {
		this.cidade = cidade;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getCidadeDesc() {
		return cidadeDesc;
	}

	public void setCidadeDesc(String cidadeDesc) {
		this.cidadeDesc = cidadeDesc;
	}

	public String getEstadoDesc() {
		return estadoDesc;
	}

	public void setEstadoDesc(String estadoDesc) {
		this.estadoDesc = estadoDesc;
	}

	public List<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}
		
}
